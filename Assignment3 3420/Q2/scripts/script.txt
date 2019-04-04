/*Graham Pomfret 0595995
	Assignment 3 Question 2
	This is the a demo for the three.js library
	the code is used in the how to post attatched in the seperate pdf--
	
	this isn't a game its just a couple of mesh graphics that demonstrate how objects,textures and animations work
	*/

"use strict"
$( document ).ready(function() {

// initializes the variables split on 3 lines to differentiate what they are used for
var camera, scene, renderer; // camera, scene, and renderer are used for displaying the contents
var geometry, material, leftP; // geometry and leftP are the shape and the mesh (which is the combined shape and material) for the left paddle
var geometry2, rightP;	// geometry and shape for right paddle
var geometry3, ballMesh; // geometry for the ball

var direction = 1; // variable to determine direction
var velocity = 1; // variable to determine speed


main();
animate();

function main() {
	// making the scene 
    scene = new THREE.Scene();
    camera = new THREE.PerspectiveCamera( 70, window.innerWidth / window.innerHeight, 0.01, 10 );
    camera.position.z = 3;
	document.addEventListener("keydown" , onDocumentKeyDown, false);
	function onDocumentKeyDown(ev)
	{
		if(ev.which==38)
		{
			rightP.position.y += 0.02;
		}
		else if(ev.which==40)
		{
			rightP.position.y -= 0.02;
		}
	}

	// making first object
	geometry = new THREE.BoxGeometry( 0.2, 1, 0.2 );
	material = new THREE.MeshNormalMaterial();
    
	leftP = new THREE.Mesh( geometry, material );
	leftP.position.x = -2;
	
	// making second object
    geometry2 = new THREE.BoxGeometry( 0.2, 1, 0.2 );
	rightP = new THREE.Mesh( geometry2, material);
	rightP.position.x = 2;
	
	// making third object 
	geometry3 = new THREE.SphereGeometry(0.1,50,50);
	
	ballMesh = new THREE.Mesh( geometry3, material);

	// adding the objects to the scene
    scene.add( leftP );
	scene.add( rightP );
	
	scene.add( ballMesh );

	// defining renderer
    renderer = new THREE.WebGLRenderer( { antialias: true } );
    
	// setting size of window to be equal to the monitor
	
	renderer.setSize( window.innerWidth, window.innerHeight );
    
	document.body.appendChild( renderer.domElement );

}

// animate is called on every frame
function animate() {
	// making a small basic animation so the idea of what the thing is is clear
    requestAnimationFrame( animate );


	// changes direction when hits the approximate x value of the paddle
	if(ballMesh.position.x <= -1.8)
	{
		direction =  1;
	}
	else if (ballMesh.position.x >= 1.8)
	{
		direction = -1;
	}
	// makes ball fly off when its going too fast
	if(velocity > 5.14)
	{
		ballMesh.position.y += 0.01 * velocity;
	}
	// resets ball when it flies off
	if(ballMesh.position.y >= 10)
	{
		ballMesh.position.x = 0;
		ballMesh.position.y = 0;
		ballMesh.position.z = 0;
		velocity = 1;
	}
	// increses speed
	velocity += 0.01;	
	
	// makes the ball move
	ballMesh.position.x += (0.01 * direction * velocity);
	
	// renders everything
    renderer.render( scene, camera );

}
});

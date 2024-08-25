// Room data
let rooms = [
	{ roomNumber: 101, roomType: "Single", price: 100, status: "Available" },
	{ roomNumber: 102, roomType: "Double", price: 150, status: "Available" },
	{ roomNumber: 103, roomType: "Suite", price: 200, status: "Booked" },
	// ...
];

// Display rooms
const roomsTbody = document.getElementById("rooms-tbody");
rooms.forEach((room) => {
	const row = document.createElement("tr");
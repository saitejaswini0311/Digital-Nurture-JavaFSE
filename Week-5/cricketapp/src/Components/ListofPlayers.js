import React from 'react';

function ListofPlayers({ players }) {
    return (
        <div>
            {players.map((item, index) => (
                <div key={index}>
                    <li>Mr. {item.name} {item.score}</li>
                </div>
            ))}
        </div>
    );
}

export default ListofPlayers;
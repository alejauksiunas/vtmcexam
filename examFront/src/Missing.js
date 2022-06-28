import { Link } from 'react-router-dom';

const Missing = () => {
    return (
        <main className='Missing'>
            <h2>Puslapis nerastas</h2>
            <p>
                <Link to='/'>Grįžti į pagrindinį puslapį</Link>
            </p>
        </main>
    )
}

export default Missing

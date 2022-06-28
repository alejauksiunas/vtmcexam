import { Link } from 'react-router-dom';

const Nav = ({ search, setSearch }) => {
    return (
        <nav className="Nav">
            <form className="searchForm" onSubmit={(e) => e.preventDefault()}>
                <label htmlFor="search">Ieškoti knygų</label>
                <input
                    id="search"
                    type="text"
                    placeholder="Ieškoti knygų"
                    value={search}
                    onChange={(e) => setSearch(e.target.value)}
                />
            </form>
            <ul>
                <li><Link to="/">Visos knygos</Link></li>
                <li><Link to="/post">Pridėti naują</Link></li>
            </ul>
        </nav>
    )
}

export default Nav

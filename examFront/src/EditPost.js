import { useEffect } from "react";
import { useParams, Link } from "react-router-dom";

const EditPost = ({
    posts, handleEdit, editBody, setEditBody, editTitle, setEditTitle
}) => {
    const { id } = useParams();
    const post = posts.find(post => (post.id).toString() === id);

    useEffect(() => {
        if (post) {
            setEditTitle(post.title);
            setEditBody(post.body);
        }
    }, [post, setEditTitle, setEditBody])

    return (
        <main className="NewPost">
            {editTitle &&
                <>
                    <h2>Redaguoti</h2>
                    <form className="newPostForm" onSubmit={(e) => e.preventDefault()}>
                        <label htmlFor="postTitle">Pavadinimas</label>
                        <input
                            id="postTitle"
                            type="text"
                            required
                            value={editTitle}
                            onChange={(e) => setEditTitle(e.target.value)}
                        />
                        <label htmlFor="postBody">Aprašymas</label>
                        <textarea
                            id="postBody"
                            required
                            value={editBody}
                            onChange={(e) => setEditBody(e.target.value)}
                        />
                        <button type="submit" onClick={() => handleEdit(post.id)}>Patvirtinti</button>
                    </form>
                </>
            }
            {!editTitle &&
                <>
                    <h2>Knyga nerasta</h2>
                    <p>
                        <Link to='/'>Grįžti į pagrindinį puslapį</Link>
                    </p>
                </>
            }
        </main>
    )
}

export default EditPost

import { useParams, Link } from "react-router-dom";

const PostPage = ({ posts, handleDelete }) => {
    const { id } = useParams();
    const post = posts.find(post => (post.id).toString() === id);
    return (
        <main className="PostPage">
            <article className="post">
                {post &&
                    <>
                        <h2>{post.title}</h2>
                        <p className="postDate">{post.datetime}</p>
                        <p className="postBody">{post.body}</p>
                        <Link to={`/edit/${post.id}`}><button className="editButton">Redaguoti</button></Link>
                        <button className="deleteButton" onClick={() => handleDelete(post.id)}>
                            Ištrinti
                        </button>
                    </>
                }
                {!post &&
                    <>
                        <h2>Knyga nerasta</h2>
                        <p>
                            <Link to='/'>Grįžti į pagrindinį puslapį</Link>
                        </p>
                    </>
                }
            </article>
        </main>
    )
}

export default PostPage

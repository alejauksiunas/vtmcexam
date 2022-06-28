const NewPost = ({
    handleSubmit, postTitle, setPostTitle, postBody, setPostBody
}) => {
    return (
        <main className="NewPost">
            <h2>Nauja knyga</h2>
            <form className="newPostForm" onSubmit={handleSubmit}>
                <label htmlFor="postTitle">Pavadinimas</label>
                <input
                    id="postTitle"
                    type="text"
                    required
                    value={postTitle}
                    onChange={(e) => setPostTitle(e.target.value)}
                />
                <label htmlFor="postBody">Aprašymas</label>
                <textarea
                    id="postBody"
                    required
                    value={postBody}
                    onChange={(e) => setPostBody(e.target.value)}
                />
                <button type="submit">Pridėti</button>
            </form>
        </main>
    )
}

export default NewPost

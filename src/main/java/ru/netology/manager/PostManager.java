package ru.netology.manager;

import ru.netology.post.Post;

public class PostManager {

    private Post[] posts;

    public String generateBlock() {
        //
        return null;
    }

    public String generate() {
        for (Post post : posts) {
            String block = generateBlock();
        }
        return null;
    }

    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset, boolean extended, String fields) {
        return null;
    }

    public void delete(int ownerId, int postId) {
        return;
    }

}

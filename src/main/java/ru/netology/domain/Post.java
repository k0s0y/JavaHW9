package ru.netology.domain;
import ru.netology.domain.description.*;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signerId;
    private String name;
    private String text;
    private String postType;
    private int replyOwnerId;
    private int replyPostId;
    private String img;
    private int date;
    private int numOfView;
    private boolean isFavorite;
    private boolean friendsOnly;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean postponedId;
    private Comments comments;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private Likes likes;
    private Reports reports;


}

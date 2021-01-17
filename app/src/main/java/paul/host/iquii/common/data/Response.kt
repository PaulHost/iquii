package paul.host.iquii.common.data

import com.google.gson.annotations.SerializedName
import paul.host.iquii.common.EMPTY_STRING


data class Response(
    @field:SerializedName("data")
    val data: Data? = null,
    @field:SerializedName("kind")
    val kind: String? = null
) {
    fun getImages(): List<String> = data?.children?.map {
        it?.data?.thumbnail ?: EMPTY_STRING
    } ?: emptyList()
/*
    TODO: correct method to get images but need to access || https://www.reddit.com/dev/api

        fun getImages(): List<String> = mutableListOf<String>().apply {
            data?.children?.forEach { children ->
                this += children?.data?.preview?.images?.map {
                    it?.source?.url ?: EMPTY_STRING
                } ?: emptyList()
            }
        }
*/
}


data class AllAwardingsItem(
    @field:SerializedName("icon_width")
    val iconWidth: Int? = null,
    @field:SerializedName("end_date")
    val endDate: Any? = null,
    @field:SerializedName("award_sub_type")
    val awardSubType: String? = null,
    @field:SerializedName("days_of_drip_extension")
    val daysOfDripExtension: Int? = null,
    @field:SerializedName("coin_reward")
    val coinReward: Int? = null,
    @field:SerializedName("description")
    val description: String? = null,
    @field:SerializedName("tiers_by_required_awardings")
    val tiersByRequiredAwardings: Any? = null,
    @field:SerializedName("awardings_required_to_grant_benefits")
    val awardingsRequiredToGrantBenefits: Any? = null,
    @field:SerializedName("resized_icons")
    val resizedIcons: List<ResizedIconsItem?>? = null,
    @field:SerializedName("coin_price")
    val coinPrice: Int? = null,
    @field:SerializedName("subreddit_coin_reward")
    val subredditCoinReward: Int? = null,
    @field:SerializedName("icon_format")
    val iconFormat: String? = null,
    @field:SerializedName("award_type")
    val awardType: String? = null,
    @field:SerializedName("static_icon_url")
    val staticIconUrl: String? = null,
    @field:SerializedName("subreddit_id")
    val subredditId: Any? = null,
    @field:SerializedName("is_enabled")
    val isEnabled: Boolean? = null,
    @field:SerializedName("penny_price")
    val pennyPrice: Int? = null,
    @field:SerializedName("penny_donate")
    val pennyDonate: Int? = null,
    @field:SerializedName("static_icon_height")
    val staticIconHeight: Int? = null,
    @field:SerializedName("id")
    val id: String? = null,
    @field:SerializedName("days_of_premium")
    val daysOfPremium: Int? = null,
    @field:SerializedName("start_date")
    val startDate: Any? = null,
    @field:SerializedName("icon_url")
    val iconUrl: String? = null,
    @field:SerializedName("is_new")
    val isNew: Boolean? = null,
    @field:SerializedName("icon_height")
    val iconHeight: Int? = null,
    @field:SerializedName("static_icon_width")
    val staticIconWidth: Int? = null,
    @field:SerializedName("count")
    val count: Int? = null,
    @field:SerializedName("resized_static_icons")
    val resizedStaticIcons: List<ResizedStaticIconsItem?>? = null,
    @field:SerializedName("giver_coin_reward")
    val giverCoinReward: Int? = null,
    @field:SerializedName("name")
    val name: String? = null
)


data class Gildings(
    val any: Any? = null
)


data class MediaEmbed(
    val any: Any? = null
)


data class ResolutionsItem(
    @field:SerializedName("width")
    val width: Int? = null,
    @field:SerializedName("url")
    val url: String? = null,
    @field:SerializedName("height")
    val height: Int? = null
)


data class S(
    @field:SerializedName("u")
    val U: String? = null,
    @field:SerializedName("x")
    val X: Int? = null,
    @field:SerializedName("y")
    val Y: Int? = null
)


data class Xjgpl0qq2la61(
    @field:SerializedName("p")
    val P: List<PItem?>? = null,
    @field:SerializedName("s")
    val S: S? = null,
    @field:SerializedName("e")
    val E: String? = null,
    @field:SerializedName("id")
    val id: String? = null,
    @field:SerializedName("m")
    val M: String? = null,
    @field:SerializedName("status")
    val status: String? = null
)


data class Data(
    @field:SerializedName("modhash")
    val modhash: String? = null,
    @field:SerializedName("children")
    val children: List<ChildrenItem?>? = null,
    @field:SerializedName("before")
    val before: Any? = null,
    @field:SerializedName("dist")
    val dist: Int? = null,
    @field:SerializedName("after")
    val after: String? = null,
    @field:SerializedName("secure_media")
    val secureMedia: Any? = null,
    @field:SerializedName("saved")
    val saved: Boolean? = null,
    @field:SerializedName("hide_score")
    val hideScore: Boolean? = null,
    @field:SerializedName("total_awards_received")
    val totalAwardsReceived: Int? = null,
    @field:SerializedName("subreddit_id")
    val subredditId: String? = null,
    @field:SerializedName("score")
    val score: Int? = null,
    @field:SerializedName("num_comments")
    val numComments: Int? = null,
    @field:SerializedName("mod_reason_title")
    val modReasonTitle: Any? = null,
    @field:SerializedName("whitelist_status")
    val whitelistStatus: String? = null,
    @field:SerializedName("removed_by")
    val removedBy: Any? = null,
    @field:SerializedName("spoiler")
    val spoiler: Boolean? = null,
    @field:SerializedName("id")
    val id: String? = null,
    @field:SerializedName("created_utc")
    val createdUtc: Double? = null,
    @field:SerializedName("banned_at_utc")
    val bannedAtUtc: Any? = null,
    @field:SerializedName("discussion_type")
    val discussionType: Any? = null,
    @field:SerializedName("allow_live_comments")
    val allowLiveComments: Boolean? = null,
    @field:SerializedName("author_flair_background_color")
    val authorFlairBackgroundColor: Any? = null,
    @field:SerializedName("approved_by")
    val approvedBy: Any? = null,
    @field:SerializedName("media_embed")
    val mediaEmbed: MediaEmbed? = null,
    @field:SerializedName("top_awarded_type")
    val topAwardedType: Any? = null,
    @field:SerializedName("domain")
    val domain: String? = null,
    @field:SerializedName("approved_at_utc")
    val approvedAtUtc: Any? = null,
    @field:SerializedName("no_follow")
    val noFollow: Boolean? = null,
    @field:SerializedName("ups")
    val ups: Int? = null,
    @field:SerializedName("author_flair_type")
    val authorFlairType: String? = null,
    @field:SerializedName("permalink")
    val permalink: String? = null,
    @field:SerializedName("content_categories")
    val contentCategories: Any? = null,
    @field:SerializedName("wls")
    val wls: Int? = null,
    @field:SerializedName("author_flair_css_class")
    val authorFlairCssClass: Any? = null,
    @field:SerializedName("mod_reports")
    val modReports: List<Any?>? = null,
    @field:SerializedName("gilded")
    val gilded: Int? = null,
    @field:SerializedName("removal_reason")
    val removalReason: Any? = null,
    @field:SerializedName("gallery_data")
    val galleryData: GalleryData? = null,
    @field:SerializedName("send_replies")
    val sendReplies: Boolean? = null,
    @field:SerializedName("archived")
    val archived: Boolean? = null,
    @field:SerializedName("author_flair_text_color")
    val authorFlairTextColor: Any? = null,
    @field:SerializedName("can_mod_post")
    val canModPost: Boolean? = null,
    @field:SerializedName("is_self")
    val isSelf: Boolean? = null,
    @field:SerializedName("author_fullname")
    val authorFullname: String? = null,
    @field:SerializedName("link_flair_css_class")
    val linkFlairCssClass: Any? = null,
    @field:SerializedName("selftext")
    val selftext: String? = null,
    @field:SerializedName("upvote_ratio")
    val upvoteRatio: Double? = null,
    @field:SerializedName("selftext_html")
    val selftextHtml: String? = null,
    @field:SerializedName("user_reports")
    val userReports: List<Any?>? = null,
    @field:SerializedName("is_crosspostable")
    val isCrosspostable: Boolean? = null,
    @field:SerializedName("clicked")
    val clicked: Boolean? = null,
    @field:SerializedName("author_flair_template_id")
    val authorFlairTemplateId: Any? = null,
    @field:SerializedName("url")
    val url: String? = null,
    @field:SerializedName("url_overridden_by_dest")
    val urlOverriddenByDest: String? = null,
    @field:SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String? = null,
    @field:SerializedName("stickied")
    val stickied: Boolean? = null,
    @field:SerializedName("quarantine")
    val quarantine: Boolean? = null,
    @field:SerializedName("view_count")
    val viewCount: Any? = null,
    @field:SerializedName("link_flair_richtext")
    val linkFlairRichtext: List<Any?>? = null,
    @field:SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String? = null,
    @field:SerializedName("is_gallery")
    val isGallery: Boolean? = null,
    @field:SerializedName("author_flair_richtext")
    val authorFlairRichtext: List<Any?>? = null,
    @field:SerializedName("over_18")
    val over18: Boolean? = null,
    @field:SerializedName("subreddit")
    val subreddit: String? = null,
    @field:SerializedName("suggested_sort")
    val suggestedSort: Any? = null,
    @field:SerializedName("media_metadata")
    val mediaMetadata: MediaMetadata? = null,
    @field:SerializedName("can_gild")
    val canGild: Boolean? = null,
    @field:SerializedName("is_robot_indexable")
    val isRobotIndexable: Boolean? = null,
    @field:SerializedName("author_premium")
    val authorPremium: Boolean? = null,
    @field:SerializedName("locked")
    val locked: Boolean? = null,
    @field:SerializedName("likes")
    val likes: Any? = null,
    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,
    @field:SerializedName("downs")
    val downs: Int? = null,
    @field:SerializedName("created")
    val created: Double? = null,
    @field:SerializedName("author")
    val author: String? = null,
    @field:SerializedName("treatment_tags")
    val treatmentTags: List<Any?>? = null,
    @field:SerializedName("link_flair_text_color")
    val linkFlairTextColor: String? = null,
    @field:SerializedName("gildings")
    val gildings: Gildings? = null,
    @field:SerializedName("report_reasons")
    val reportReasons: Any? = null,
    @field:SerializedName("is_video")
    val isVideo: Boolean? = null,
    @field:SerializedName("is_original_content")
    val isOriginalContent: Boolean? = null,
    @field:SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String? = null,
    @field:SerializedName("mod_reason_by")
    val modReasonBy: Any? = null,
    @field:SerializedName("name")
    val name: String? = null,
    @field:SerializedName("awarders")
    val awarders: List<Any?>? = null,
    @field:SerializedName("media_only")
    val mediaOnly: Boolean? = null,
    @field:SerializedName("num_reports")
    val numReports: Any? = null,
    @field:SerializedName("pinned")
    val pinned: Boolean? = null,
    @field:SerializedName("hidden")
    val hidden: Boolean? = null,
    @field:SerializedName("author_patreon_flair")
    val authorPatreonFlair: Boolean? = null,
    @field:SerializedName("mod_note")
    val modNote: Any? = null,
    @field:SerializedName("media")
    val media: Any? = null,
    @field:SerializedName("title")
    val title: String? = null,
    @field:SerializedName("author_flair_text")
    val authorFlairText: Any? = null,
    @field:SerializedName("num_crossposts")
    val numCrossposts: Int? = null,
    @field:SerializedName("thumbnail_width")
    val thumbnailWidth: Any? = null,
    @field:SerializedName("secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed? = null,
    @field:SerializedName("link_flair_text")
    val linkFlairText: Any? = null,
    @field:SerializedName("subreddit_type")
    val subredditType: String? = null,
    @field:SerializedName("is_meta")
    val isMeta: Boolean? = null,
    @field:SerializedName("subreddit_subscribers")
    val subredditSubscribers: Int? = null,
    @field:SerializedName("distinguished")
    val distinguished: Any? = null,
    @field:SerializedName("removed_by_category")
    val removedByCategory: Any? = null,
    @field:SerializedName("thumbnail_height")
    val thumbnailHeight: Any? = null,
    @field:SerializedName("link_flair_type")
    val linkFlairType: String? = null,
    @field:SerializedName("all_awardings")
    val allAwardings: List<AllAwardingsItem?>? = null,
    @field:SerializedName("visited")
    val visited: Boolean? = null,
    @field:SerializedName("pwls")
    val pwls: Int? = null,
    @field:SerializedName("category")
    val category: Any? = null,
    @field:SerializedName("banned_by")
    val bannedBy: Any? = null,
    @field:SerializedName("contest_mode")
    val contestMode: Boolean? = null,
    @field:SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean? = null,
    @field:SerializedName("link_flair_template_id")
    val linkFlairTemplateId: String? = null,
    @field:SerializedName("post_hint")
    val postHint: String? = null,
    @field:SerializedName("preview")
    val preview: Preview? = null
)


data class MediaMetadata(
    @field:SerializedName("rbr39qcr2la61")
    val rbr39qcr2la61: Rbr39qcr2la61? = null,
    @field:SerializedName("xjgpl0qq2la61")
    val xjgpl0qq2la61: Xjgpl0qq2la61? = null
)


data class Rbr39qcr2la61(
    @field:SerializedName("p")
    val P: List<PItem?>? = null,
    @field:SerializedName("s")
    val S: S? = null,
    @field:SerializedName("e")
    val E: String? = null,
    @field:SerializedName("id")
    val id: String? = null,
    @field:SerializedName("m")
    val M: String? = null,
    @field:SerializedName("status")
    val status: String? = null
)


data class PItem(
    @field:SerializedName("u")
    val U: String? = null,
    @field:SerializedName("x")
    val X: Int? = null,
    @field:SerializedName("y")
    val Y: Int? = null
)


data class ImagesItem(
    @field:SerializedName("resolutions")
    val resolutions: List<ResolutionsItem?>? = null,
    @field:SerializedName("source")
    val source: Source? = null,
    @field:SerializedName("variants")
    val variants: Variants? = null,
    @field:SerializedName("id")
    val id: String? = null
)


data class ResizedStaticIconsItem(
    @field:SerializedName("width")
    val width: Int? = null,
    @field:SerializedName("url")
    val url: String? = null,
    @field:SerializedName("height")
    val height: Int? = null
)


data class SecureMediaEmbed(
    val any: Any? = null
)


data class Source(
    @field:SerializedName("width")
    val width: Int? = null,
    @field:SerializedName("url")
    val url: String? = null,
    @field:SerializedName("height")
    val height: Int? = null
)


data class Preview(
    @field:SerializedName("images")
    val images: List<ImagesItem?>? = null,
    @field:SerializedName("enabled")
    val enabled: Boolean? = null
)


data class GalleryData(
    @field:SerializedName("items")
    val items: List<ItemsItem?>? = null
)


data class Variants(
    val any: Any? = null
)


data class ResizedIconsItem(
    @field:SerializedName("width")
    val width: Int? = null,
    @field:SerializedName("url")
    val url: String? = null,
    @field:SerializedName("height")
    val height: Int? = null
)


data class ChildrenItem(
    @field:SerializedName("data")
    val data: Data? = null,
    @field:SerializedName("kind")
    val kind: String? = null
)


data class ItemsItem(
    @field:SerializedName("media_id")
    val mediaId: String? = null,
    @field:SerializedName("id")
    val id: Int? = null
) 

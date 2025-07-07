/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ame.v20190916;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ame.v20190916.models.*;

public class AmeClient extends AbstractClient{
    private static String endpoint = "ame.tencentcloudapi.com";
    private static String service = "ame";
    private static String version = "2019-09-16";

    public AmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AmeClient(Credential credential, String region, ClientProfile profile) {
        super(AmeClient.endpoint, AmeClient.version, credential, region, profile);
    }

    /**
     *根据 Id 列表查询歌曲的详细信息，包含基础信息及播放信息。
     * @param req BatchDescribeKTVMusicDetailsRequest
     * @return BatchDescribeKTVMusicDetailsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeKTVMusicDetailsResponse BatchDescribeKTVMusicDetails(BatchDescribeKTVMusicDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDescribeKTVMusicDetails", BatchDescribeKTVMusicDetailsResponse.class);
    }

    /**
     *创建机器人，支持进入 RTC 房间，播放直播互动曲库歌曲。
     * @param req CreateKTVRobotRequest
     * @return CreateKTVRobotResponse
     * @throws TencentCloudSDKException
     */
    public CreateKTVRobotResponse CreateKTVRobot(CreateKTVRobotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKTVRobot", CreateKTVRobotResponse.class);
    }

    /**
     *获取授权项目信息列表
     * @param req DescribeAuthInfoRequest
     * @return DescribeAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthInfoResponse DescribeAuthInfo(DescribeAuthInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthInfo", DescribeAuthInfoResponse.class);
    }

    /**
     *获取云音乐播放信息接口
     * @param req DescribeCloudMusicRequest
     * @return DescribeCloudMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudMusicResponse DescribeCloudMusic(DescribeCloudMusicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudMusic", DescribeCloudMusicResponse.class);
    }

    /**
     *获取授权项目下已购云音乐列表
     * @param req DescribeCloudMusicPurchasedRequest
     * @return DescribeCloudMusicPurchasedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudMusicPurchasedResponse DescribeCloudMusicPurchased(DescribeCloudMusicPurchasedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudMusicPurchased", DescribeCloudMusicPurchasedResponse.class);
    }

    /**
     *根据歌曲ID查询歌曲信息
     * @param req DescribeItemByIdRequest
     * @return DescribeItemByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemByIdResponse DescribeItemById(DescribeItemByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeItemById", DescribeItemByIdResponse.class);
    }

    /**
     *该服务后续会停用，不再建议使用
     * @param req DescribeItemsRequest
     * @return DescribeItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemsResponse DescribeItems(DescribeItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeItems", DescribeItemsResponse.class);
    }

    /**
     *根据 Id 查询歌曲的详细信息，包含基础信息及播放信息。
     * @param req DescribeKTVMusicDetailRequest
     * @return DescribeKTVMusicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVMusicDetailResponse DescribeKTVMusicDetail(DescribeKTVMusicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVMusicDetail", DescribeKTVMusicDetailResponse.class);
    }

    /**
     *获取直播互动曲库标签分组信息和标签信息
     * @param req DescribeKTVMusicTagsRequest
     * @return DescribeKTVMusicTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVMusicTagsResponse DescribeKTVMusicTags(DescribeKTVMusicTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVMusicTags", DescribeKTVMusicTagsResponse.class);
    }

    /**
     *根据歌单 Id 获取歌单详情，包括歌单的基础信息以及歌曲列表。
     * @param req DescribeKTVPlaylistDetailRequest
     * @return DescribeKTVPlaylistDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistDetailResponse DescribeKTVPlaylistDetail(DescribeKTVPlaylistDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVPlaylistDetail", DescribeKTVPlaylistDetailResponse.class);
    }

    /**
     *获取直播互动曲库推荐歌单列表。
     * @param req DescribeKTVPlaylistsRequest
     * @return DescribeKTVPlaylistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistsResponse DescribeKTVPlaylists(DescribeKTVPlaylistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVPlaylists", DescribeKTVPlaylistsResponse.class);
    }

    /**
     *获取机器人列表，支持 Id、状态等过滤条件。
     * @param req DescribeKTVRobotsRequest
     * @return DescribeKTVRobotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVRobotsResponse DescribeKTVRobots(DescribeKTVRobotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVRobots", DescribeKTVRobotsResponse.class);
    }

    /**
     *获取直播互动曲库歌手分类信息
     * @param req DescribeKTVSingerCategoriesRequest
     * @return DescribeKTVSingerCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVSingerCategoriesResponse DescribeKTVSingerCategories(DescribeKTVSingerCategoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVSingerCategories", DescribeKTVSingerCategoriesResponse.class);
    }

    /**
     *根据歌手id，返回该歌手下歌曲列表。



     * @param req DescribeKTVSingerMusicsRequest
     * @return DescribeKTVSingerMusicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVSingerMusicsResponse DescribeKTVSingerMusics(DescribeKTVSingerMusicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVSingerMusics", DescribeKTVSingerMusicsResponse.class);
    }

    /**
     *根据过滤条件，返回匹配的歌手列表。
     * @param req DescribeKTVSingersRequest
     * @return DescribeKTVSingersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVSingersResponse DescribeKTVSingers(DescribeKTVSingersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVSingers", DescribeKTVSingersResponse.class);
    }

    /**
     *获取直播互动曲库联想词
     * @param req DescribeKTVSuggestionsRequest
     * @return DescribeKTVSuggestionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVSuggestionsResponse DescribeKTVSuggestions(DescribeKTVSuggestionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVSuggestions", DescribeKTVSuggestionsResponse.class);
    }

    /**
     *获取直播互动曲库歌曲的周榜和月榜
     * @param req DescribeKTVTopListRequest
     * @return DescribeKTVTopListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVTopListResponse DescribeKTVTopList(DescribeKTVTopListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKTVTopList", DescribeKTVTopListResponse.class);
    }

    /**
     *根据接口的模式及歌曲ID来取得歌词信息或者波形图信息。
     * @param req DescribeLyricRequest
     * @return DescribeLyricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLyricResponse DescribeLyric(DescribeLyricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLyric", DescribeLyricResponse.class);
    }

    /**
     *获取曲库包歌曲播放信息接口
     * @param req DescribeMusicRequest
     * @return DescribeMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMusicResponse DescribeMusic(DescribeMusicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMusic", DescribeMusicResponse.class);
    }

    /**
     *根据音乐信息查询音乐是否在售
     * @param req DescribeMusicSaleStatusRequest
     * @return DescribeMusicSaleStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMusicSaleStatusResponse DescribeMusicSaleStatus(DescribeMusicSaleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMusicSaleStatus", DescribeMusicSaleStatusResponse.class);
    }

    /**
     *获取曲库包下已核销歌曲列表接口
     * @param req DescribePackageItemsRequest
     * @return DescribePackageItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageItemsResponse DescribePackageItems(DescribePackageItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackageItems", DescribePackageItemsResponse.class);
    }

    /**
     *获取已购曲库包列表接口
     * @param req DescribePackagesRequest
     * @return DescribePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackagesResponse DescribePackages(DescribePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackages", DescribePackagesResponse.class);
    }

    /**
     *根据购买曲库包用户可查询已回退的歌曲信息
     * @param req DescribePkgOfflineMusicRequest
     * @return DescribePkgOfflineMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribePkgOfflineMusicResponse DescribePkgOfflineMusic(DescribePkgOfflineMusicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePkgOfflineMusic", DescribePkgOfflineMusicResponse.class);
    }

    /**
     *该服务后续会停用，不再建议使用
     * @param req DescribeStationsRequest
     * @return DescribeStationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStationsResponse DescribeStations(DescribeStationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStations", DescribeStationsResponse.class);
    }

    /**
     *销毁机器人，机器人退出 RTC 房间。
     * @param req DestroyKTVRobotRequest
     * @return DestroyKTVRobotResponse
     * @throws TencentCloudSDKException
     */
    public DestroyKTVRobotResponse DestroyKTVRobot(DestroyKTVRobotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyKTVRobot", DestroyKTVRobotResponse.class);
    }

    /**
     *根据资源方，需要变更的参数，请求该接口进行变更，为空的参数默认为无变更
     * @param req ModifyMusicOnShelvesRequest
     * @return ModifyMusicOnShelvesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMusicOnShelvesResponse ModifyMusicOnShelves(ModifyMusicOnShelvesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMusicOnShelves", ModifyMusicOnShelvesResponse.class);
    }

    /**
     *根据资源方所传歌曲信息，进行歌曲上架，多个歌曲同时请求时，需构造复合结构进行请求
     * @param req PutMusicOnTheShelvesRequest
     * @return PutMusicOnTheShelvesResponse
     * @throws TencentCloudSDKException
     */
    public PutMusicOnTheShelvesResponse PutMusicOnTheShelves(PutMusicOnTheShelvesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutMusicOnTheShelves", PutMusicOnTheShelvesResponse.class);
    }

    /**
     *客户上报用户数据功能，为了更好地为用户提供优质服务
     * @param req ReportDataRequest
     * @return ReportDataResponse
     * @throws TencentCloudSDKException
     */
    public ReportDataResponse ReportData(ReportDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportData", ReportDataResponse.class);
    }

    /**
     *根据搜索条件，返回匹配的歌曲列表。
     * @param req SearchKTVMusicsRequest
     * @return SearchKTVMusicsResponse
     * @throws TencentCloudSDKException
     */
    public SearchKTVMusicsResponse SearchKTVMusics(SearchKTVMusicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchKTVMusics", SearchKTVMusicsResponse.class);
    }

    /**
     *下发操作机器人指令，支持播放、暂停、恢复、歌单设置等操作指令，实现对机器人行为的控制。
     * @param req SyncKTVRobotCommandRequest
     * @return SyncKTVRobotCommandResponse
     * @throws TencentCloudSDKException
     */
    public SyncKTVRobotCommandResponse SyncKTVRobotCommand(SyncKTVRobotCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncKTVRobotCommand", SyncKTVRobotCommandResponse.class);
    }

    /**
     *根据资源方所传MusicId进行将歌曲进行下架，多个MusicId使用逗号隔开
     * @param req TakeMusicOffShelvesRequest
     * @return TakeMusicOffShelvesResponse
     * @throws TencentCloudSDKException
     */
    public TakeMusicOffShelvesResponse TakeMusicOffShelves(TakeMusicOffShelvesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TakeMusicOffShelves", TakeMusicOffShelvesResponse.class);
    }

}

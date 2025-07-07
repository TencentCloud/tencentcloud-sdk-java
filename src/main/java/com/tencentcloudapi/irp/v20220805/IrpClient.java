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
package com.tencentcloudapi.irp.v20220805;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.irp.v20220805.models.*;

public class IrpClient extends AbstractClient{
    private static String endpoint = "irp.tencentcloudapi.com";
    private static String service = "irp";
    private static String version = "2022-08-05";

    public IrpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IrpClient(Credential credential, String region, ClientProfile profile) {
        super(IrpClient.endpoint, IrpClient.version, credential, region, profile);
    }

    /**
     *获取电商类推荐结果
     * @param req DescribeGoodsRecommendRequest
     * @return DescribeGoodsRecommendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGoodsRecommendResponse DescribeGoodsRecommend(DescribeGoodsRecommendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGoodsRecommend", DescribeGoodsRecommendResponse.class);
    }

    /**
     *获取信息流推荐结果
     * @param req FeedRecommendRequest
     * @return FeedRecommendResponse
     * @throws TencentCloudSDKException
     */
    public FeedRecommendResponse FeedRecommend(FeedRecommendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FeedRecommend", FeedRecommendResponse.class);
    }

    /**
     *上报信息流场景内的行为数据，随着数据的积累，模型的效果会逐渐稳定。
     * @param req ReportFeedBehaviorRequest
     * @return ReportFeedBehaviorResponse
     * @throws TencentCloudSDKException
     */
    public ReportFeedBehaviorResponse ReportFeedBehavior(ReportFeedBehaviorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportFeedBehavior", ReportFeedBehaviorResponse.class);
    }

    /**
     *上报被用于推荐的信息流内容信息
     * @param req ReportFeedItemRequest
     * @return ReportFeedItemResponse
     * @throws TencentCloudSDKException
     */
    public ReportFeedItemResponse ReportFeedItem(ReportFeedItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportFeedItem", ReportFeedItemResponse.class);
    }

    /**
     *上报信息流用户信息，请务必确认用户的唯一性，并在请求推荐结果时指定用户的唯一标识信息（UserId），否则将无法进行千人千面的推荐
     * @param req ReportFeedUserRequest
     * @return ReportFeedUserResponse
     * @throws TencentCloudSDKException
     */
    public ReportFeedUserResponse ReportFeedUser(ReportFeedUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportFeedUser", ReportFeedUserResponse.class);
    }

    /**
     *上报电商类行为数据
     * @param req ReportGoodsBehaviorRequest
     * @return ReportGoodsBehaviorResponse
     * @throws TencentCloudSDKException
     */
    public ReportGoodsBehaviorResponse ReportGoodsBehavior(ReportGoodsBehaviorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportGoodsBehavior", ReportGoodsBehaviorResponse.class);
    }

    /**
     *上报电商类商品信息
     * @param req ReportGoodsInfoRequest
     * @return ReportGoodsInfoResponse
     * @throws TencentCloudSDKException
     */
    public ReportGoodsInfoResponse ReportGoodsInfo(ReportGoodsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportGoodsInfo", ReportGoodsInfoResponse.class);
    }

}

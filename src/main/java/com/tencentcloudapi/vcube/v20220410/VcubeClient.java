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
package com.tencentcloudapi.vcube.v20220410;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vcube.v20220410.models.*;

public class VcubeClient extends AbstractClient{
    private static String endpoint = "vcube.tencentcloudapi.com";
    private static String service = "vcube";
    private static String version = "2022-04-10";

    public VcubeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VcubeClient(Credential credential, String region, ClientProfile profile) {
        super(VcubeClient.endpoint, VcubeClient.version, credential, region, profile);
    }

    /**
     *创建活动license
     * @param req CreateActivityLicenseRequest
     * @return CreateActivityLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateActivityLicenseResponse CreateActivityLicense(CreateActivityLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateActivityLicense", CreateActivityLicenseResponse.class);
    }

    /**
     *创建应用并绑定license或者XMagic
     * @param req CreateApplicationAndBindLicenseRequest
     * @return CreateApplicationAndBindLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAndBindLicenseResponse CreateApplicationAndBindLicense(CreateApplicationAndBindLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationAndBindLicense", CreateApplicationAndBindLicenseResponse.class);
    }

    /**
     *创建应用和视频播放license 目前只有国际站可以用
     * @param req CreateApplicationAndVideoRequest
     * @return CreateApplicationAndVideoResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAndVideoResponse CreateApplicationAndVideo(CreateApplicationAndVideoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationAndVideo", CreateApplicationAndVideoResponse.class);
    }

    /**
     *创建 web 播放器基础版
     * @param req CreateApplicationAndWebPlayerLicenseRequest
     * @return CreateApplicationAndWebPlayerLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAndWebPlayerLicenseResponse CreateApplicationAndWebPlayerLicense(CreateApplicationAndWebPlayerLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationAndWebPlayerLicense", CreateApplicationAndWebPlayerLicenseResponse.class);
    }

    /**
     *绑定license
     * @param req CreateLicenseRequest
     * @return CreateLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateLicenseResponse CreateLicense(CreateLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLicense", CreateLicenseResponse.class);
    }

    /**
     *申请开通测试版腾讯特效
     * @param req CreateTestXMagicRequest
     * @return CreateTestXMagicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTestXMagicResponse CreateTestXMagic(CreateTestXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTestXMagic", CreateTestXMagicResponse.class);
    }

    /**
     *创建测试应用并开通测试 license
     * @param req CreateTrialApplicationAndLicenseRequest
     * @return CreateTrialApplicationAndLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrialApplicationAndLicenseResponse CreateTrialApplicationAndLicense(CreateTrialApplicationAndLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrialApplicationAndLicense", CreateTrialApplicationAndLicenseResponse.class);
    }

    /**
     *开通测试license
     * @param req CreateTrialLicenseRequest
     * @return CreateTrialLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrialLicenseResponse CreateTrialLicense(CreateTrialLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrialLicense", CreateTrialLicenseResponse.class);
    }

    /**
     *x08开通正式版优图美视功能，针对已经有Application的情况
     * @param req CreateXMagicRequest
     * @return CreateXMagicResponse
     * @throws TencentCloudSDKException
     */
    public CreateXMagicResponse CreateXMagic(CreateXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateXMagic", CreateXMagicResponse.class);
    }

    /**
     *删除视频播放器 License 和相关应用
     * @param req DeleteApplicationAndVideoLicenseRequest
     * @return DeleteApplicationAndVideoLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationAndVideoLicenseResponse DeleteApplicationAndVideoLicense(DeleteApplicationAndVideoLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationAndVideoLicense", DeleteApplicationAndVideoLicenseResponse.class);
    }

    /**
     *删除web播放器license和应用
     * @param req DeleteApplicationAndWebPlayerLicenseRequest
     * @return DeleteApplicationAndWebPlayerLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationAndWebPlayerLicenseResponse DeleteApplicationAndWebPlayerLicense(DeleteApplicationAndWebPlayerLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationAndWebPlayerLicense", DeleteApplicationAndWebPlayerLicenseResponse.class);
    }

    /**
     *查询功能列表
     * @param req DescribeFeatureListRequest
     * @return DescribeFeatureListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFeatureListResponse DescribeFeatureList(DescribeFeatureListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFeatureList", DescribeFeatureListResponse.class);
    }

    /**
     *总览页查询临期License列表，和统计数据
     * @param req DescribeLicenseListRequest
     * @return DescribeLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseListResponse DescribeLicenseList(DescribeLicenseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseList", DescribeLicenseListResponse.class);
    }

    /**
     *查询产品动态
     * @param req DescribeNewsRequest
     * @return DescribeNewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewsResponse DescribeNews(DescribeNewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNews", DescribeNewsResponse.class);
    }

    /**
     *获取临时秘钥，用于图片，特效包上传
     * @param req DescribeSTSRequest
     * @return DescribeSTSResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSTSResponse DescribeSTS(DescribeSTSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSTS", DescribeSTSResponse.class);
    }

    /**
     *查询测试应用可以开通的功能
     * @param req DescribeTrialFeatureRequest
     * @return DescribeTrialFeatureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrialFeatureResponse DescribeTrialFeature(DescribeTrialFeatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrialFeature", DescribeTrialFeatureResponse.class);
    }

    /**
     *查询用户个性配置
     * @param req DescribeUserConfigRequest
     * @return DescribeUserConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserConfigResponse DescribeUserConfig(DescribeUserConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserConfig", DescribeUserConfigResponse.class);
    }

    /**
     *查询用户license， 按照应用分类
     * @param req DescribeVcubeApplicationAndLicenseRequest
     * @return DescribeVcubeApplicationAndLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVcubeApplicationAndLicenseResponse DescribeVcubeApplicationAndLicense(DescribeVcubeApplicationAndLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVcubeApplicationAndLicense", DescribeVcubeApplicationAndLicenseResponse.class);
    }

    /**
     *查询用户点播直播等license， 按照应用分类,国际站专用
     * @param req DescribeVcubeApplicationAndPlayListRequest
     * @return DescribeVcubeApplicationAndPlayListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVcubeApplicationAndPlayListResponse DescribeVcubeApplicationAndPlayList(DescribeVcubeApplicationAndPlayListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVcubeApplicationAndPlayList", DescribeVcubeApplicationAndPlayListResponse.class);
    }

    /**
     *查询用户优图license， 按照应用分类
     * @param req DescribeVcubeApplicationAndXMagicListRequest
     * @return DescribeVcubeApplicationAndXMagicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVcubeApplicationAndXMagicListResponse DescribeVcubeApplicationAndXMagicList(DescribeVcubeApplicationAndXMagicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVcubeApplicationAndXMagicList", DescribeVcubeApplicationAndXMagicListResponse.class);
    }

    /**
     *查询视立方 license 资源，所有的资源包
     * @param req DescribeVcubeResourcesRequest
     * @return DescribeVcubeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVcubeResourcesResponse DescribeVcubeResources(DescribeVcubeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVcubeResources", DescribeVcubeResourcesResponse.class);
    }

    /**
     *查询视立方 license 资源，包括资源包赠送和直接购买的资源
     * @param req DescribeVcubeResourcesListRequest
     * @return DescribeVcubeResourcesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVcubeResourcesListResponse DescribeVcubeResourcesList(DescribeVcubeResourcesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVcubeResourcesList", DescribeVcubeResourcesListResponse.class);
    }

    /**
     *用途美视资源包用于开通正式优图美视
     * @param req DescribeXMagicResourceRequest
     * @return DescribeXMagicResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXMagicResourceResponse DescribeXMagicResource(DescribeXMagicResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeXMagicResource", DescribeXMagicResourceResponse.class);
    }

    /**
     *用于优图美视资源列表展示
     * @param req DescribeXMagicResourceListRequest
     * @return DescribeXMagicResourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXMagicResourceListResponse DescribeXMagicResourceList(DescribeXMagicResourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeXMagicResourceList", DescribeXMagicResourceListResponse.class);
    }

    /**
     *更改测试包名信息
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *修改正式应用的包名称
     * @param req ModifyFormalApplicationRequest
     * @return ModifyFormalApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFormalApplicationResponse ModifyFormalApplication(ModifyFormalApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFormalApplication", ModifyFormalApplicationResponse.class);
    }

    /**
     *正式license 升降配，点播精简版、基础版
     * @param req ModifyLicenseRequest
     * @return ModifyLicenseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseResponse ModifyLicense(ModifyLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicense", ModifyLicenseResponse.class);
    }

    /**
     *修改内置应用包名
     * @param req ModifyPresetApplicationRequest
     * @return ModifyPresetApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPresetApplicationResponse ModifyPresetApplication(ModifyPresetApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPresetApplication", ModifyPresetApplicationResponse.class);
    }

    /**
     *续期测试license
     * @param req ModifyTrialLicenseRequest
     * @return ModifyTrialLicenseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTrialLicenseResponse ModifyTrialLicense(ModifyTrialLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTrialLicense", ModifyTrialLicenseResponse.class);
    }

    /**
     *使用一个腾讯特效资源，更新现在的腾讯特效license，license功能和到期时间会以新的资源为准，老资源会被替换下来
     * @param req ModifyXMagicRequest
     * @return ModifyXMagicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyXMagicResponse ModifyXMagic(ModifyXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyXMagic", ModifyXMagicResponse.class);
    }

    /**
     *正式license 续期与变更有效期
     * @param req RenewLicenseRequest
     * @return RenewLicenseResponse
     * @throws TencentCloudSDKException
     */
    public RenewLicenseResponse RenewLicense(RenewLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewLicense", RenewLicenseResponse.class);
    }

    /**
     *续期测试版优图美视
     * @param req RenewTestXMagicRequest
     * @return RenewTestXMagicResponse
     * @throws TencentCloudSDKException
     */
    public RenewTestXMagicResponse RenewTestXMagic(RenewTestXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewTestXMagic", RenewTestXMagicResponse.class);
    }

    /**
     *续期国际站视频播放功能和中国站web基础版
     * @param req RenewVideoRequest
     * @return RenewVideoResponse
     * @throws TencentCloudSDKException
     */
    public RenewVideoResponse RenewVideo(RenewVideoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewVideo", RenewVideoResponse.class);
    }

    /**
     *将测试xmagic升级到正式版
     * @param req UpdateTestXMagicRequest
     * @return UpdateTestXMagicResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTestXMagicResponse UpdateTestXMagic(UpdateTestXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTestXMagic", UpdateTestXMagicResponse.class);
    }

    /**
     *测试 license 升级为正式 license
     * @param req UpdateTrialLicenseRequest
     * @return UpdateTrialLicenseResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTrialLicenseResponse UpdateTrialLicense(UpdateTrialLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTrialLicense", UpdateTrialLicenseResponse.class);
    }

    /**
     *更新优图美视的申请信息 Status 为2，3的时候可用
     * @param req UpdateXMagicRequest
     * @return UpdateXMagicResponse
     * @throws TencentCloudSDKException
     */
    public UpdateXMagicResponse UpdateXMagic(UpdateXMagicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateXMagic", UpdateXMagicResponse.class);
    }

}

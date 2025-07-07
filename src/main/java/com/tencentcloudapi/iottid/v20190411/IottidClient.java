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
package com.tencentcloudapi.iottid.v20190411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iottid.v20190411.models.*;

public class IottidClient extends AbstractClient{
    private static String endpoint = "iottid.tencentcloudapi.com";
    private static String service = "iottid";
    private static String version = "2019-04-11";

    public IottidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IottidClient(Credential credential, String region, ClientProfile profile) {
        super(IottidClient.endpoint, IottidClient.version, credential, region, profile);
    }

    /**
     *单向认证测试TID 
     * @param req AuthTestTidRequest
     * @return AuthTestTidResponse
     * @throws TencentCloudSDKException
     */
    public AuthTestTidResponse AuthTestTid(AuthTestTidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthTestTid", AuthTestTidResponse.class);
    }

    /**
     *安全芯片TID烧录回执 
     * @param req BurnTidNotifyRequest
     * @return BurnTidNotifyResponse
     * @throws TencentCloudSDKException
     */
    public BurnTidNotifyResponse BurnTidNotify(BurnTidNotifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BurnTidNotify", BurnTidNotifyResponse.class);
    }

    /**
     *安全芯片为载体的TID空发回执，绑定TID与订单号。 
     * @param req DeliverTidNotifyRequest
     * @return DeliverTidNotifyResponse
     * @throws TencentCloudSDKException
     */
    public DeliverTidNotifyResponse DeliverTidNotify(DeliverTidNotifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeliverTidNotify", DeliverTidNotifyResponse.class);
    }

    /**
     *设备服务商请求空发产品订单的TID信息 
     * @param req DeliverTidsRequest
     * @return DeliverTidsResponse
     * @throws TencentCloudSDKException
     */
    public DeliverTidsResponse DeliverTids(DeliverTidsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeliverTids", DeliverTidsResponse.class);
    }

    /**
     *查询指定订单的可空发的白盒密钥数量
     * @param req DescribeAvailableLibCountRequest
     * @return DescribeAvailableLibCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableLibCountResponse DescribeAvailableLibCount(DescribeAvailableLibCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableLibCount", DescribeAvailableLibCountResponse.class);
    }

    /**
     *查询企业用户TID平台控制台权限 
     * @param req DescribePermissionRequest
     * @return DescribePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribePermissionResponse DescribePermission(DescribePermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePermission", DescribePermissionResponse.class);
    }

    /**
     *下载芯片订单的TID 
     * @param req DownloadTidsRequest
     * @return DownloadTidsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadTidsResponse DownloadTids(DownloadTidsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadTids", DownloadTidsResponse.class);
    }

    /**
     *上传硬件唯一标识码，是软加固设备身份参数。本接口如遇到错误数据，则所有当次上传数据失效。
     * @param req UploadDeviceUniqueCodeRequest
     * @return UploadDeviceUniqueCodeResponse
     * @throws TencentCloudSDKException
     */
    public UploadDeviceUniqueCodeResponse UploadDeviceUniqueCode(UploadDeviceUniqueCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadDeviceUniqueCode", UploadDeviceUniqueCodeResponse.class);
    }

    /**
     *下载控制台验证芯片烧录信息，保证TID与中心信息一致 
     * @param req VerifyChipBurnInfoRequest
     * @return VerifyChipBurnInfoResponse
     * @throws TencentCloudSDKException
     */
    public VerifyChipBurnInfoResponse VerifyChipBurnInfo(VerifyChipBurnInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyChipBurnInfo", VerifyChipBurnInfoResponse.class);
    }

}

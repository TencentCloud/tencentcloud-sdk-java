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
package com.tencentcloudapi.monitor.v20230616;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20230616.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.tencentcloudapi.com";
    private static String service = "monitor";
    private static String version = "2023-06-16";

    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *创建自定义通知内容模板
     * @param req CreateNoticeContentTmplRequest
     * @return CreateNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public CreateNoticeContentTmplResponse CreateNoticeContentTmpl(CreateNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNoticeContentTmpl", CreateNoticeContentTmplResponse.class);
    }

    /**
     *删除通知内容模板
     * @param req DeleteNoticeContentTmplsRequest
     * @return DeleteNoticeContentTmplsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNoticeContentTmplsResponse DeleteNoticeContentTmpls(DeleteNoticeContentTmplsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNoticeContentTmpls", DeleteNoticeContentTmplsResponse.class);
    }

    /**
     *按需查询告警的通知历史
     * @param req DescribeAlarmNotifyHistoriesRequest
     * @return DescribeAlarmNotifyHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNotifyHistoriesResponse DescribeAlarmNotifyHistories(DescribeAlarmNotifyHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotifyHistories", DescribeAlarmNotifyHistoriesResponse.class);
    }

    /**
     *根据查询条件获取自定义通知内容模板，若所有查询条件空，则获取账号下所有模板
     * @param req DescribeNoticeContentTmplRequest
     * @return DescribeNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoticeContentTmplResponse DescribeNoticeContentTmpl(DescribeNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoticeContentTmpl", DescribeNoticeContentTmplResponse.class);
    }

    /**
     *修改通知内容模板
     * @param req ModifyNoticeContentTmplRequest
     * @return ModifyNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNoticeContentTmplResponse ModifyNoticeContentTmpl(ModifyNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNoticeContentTmpl", ModifyNoticeContentTmplResponse.class);
    }

}

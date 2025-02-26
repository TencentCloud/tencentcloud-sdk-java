/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lowcode.v20210108;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lowcode.v20210108.models.*;

public class LowcodeClient extends AbstractClient{
    private static String endpoint = "lowcode.tencentcloudapi.com";
    private static String service = "lowcode";
    private static String version = "2021-01-08";
    
    public LowcodeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LowcodeClient(Credential credential, String region, ClientProfile profile) {
        super(LowcodeClient.endpoint, LowcodeClient.version, credential, region, profile);
    }

    /**
     *创建知识库
     * @param req CreateKnowledgeSetRequest
     * @return CreateKnowledgeSetResponse
     * @throws TencentCloudSDKException
     */
    public CreateKnowledgeSetResponse CreateKnowledgeSet(CreateKnowledgeSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKnowledgeSet", CreateKnowledgeSetResponse.class);
    }

    /**
     *删除知识库下文档
     * @param req DeleteKnowledgeDocumentSetRequest
     * @return DeleteKnowledgeDocumentSetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKnowledgeDocumentSetResponse DeleteKnowledgeDocumentSet(DeleteKnowledgeDocumentSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKnowledgeDocumentSet", DeleteKnowledgeDocumentSetResponse.class);
    }

    /**
     *删除知识库
     * @param req DeleteKnowledgeSetRequest
     * @return DeleteKnowledgeSetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKnowledgeSetResponse DeleteKnowledgeSet(DeleteKnowledgeSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKnowledgeSet", DeleteKnowledgeSetResponse.class);
    }

    /**
     *获取数据源详情列表
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceList", DescribeDataSourceListResponse.class);
    }

    /**
     *获取知识库下文档详情
     * @param req DescribeKnowledgeDocumentSetDetailRequest
     * @return DescribeKnowledgeDocumentSetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeDocumentSetDetailResponse DescribeKnowledgeDocumentSetDetail(DescribeKnowledgeDocumentSetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeDocumentSetDetail", DescribeKnowledgeDocumentSetDetailResponse.class);
    }

    /**
     *查询知识库下文件集合
     * @param req DescribeKnowledgeDocumentSetListRequest
     * @return DescribeKnowledgeDocumentSetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeDocumentSetListResponse DescribeKnowledgeDocumentSetList(DescribeKnowledgeDocumentSetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeDocumentSetList", DescribeKnowledgeDocumentSetListResponse.class);
    }

    /**
     *查询知识库
     * @param req DescribeKnowledgeSetListRequest
     * @return DescribeKnowledgeSetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeSetListResponse DescribeKnowledgeSetList(DescribeKnowledgeSetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeSetList", DescribeKnowledgeSetListResponse.class);
    }

    /**
     *知识库文档搜索接口
     * @param req SearchDocListRequest
     * @return SearchDocListResponse
     * @throws TencentCloudSDKException
     */
    public SearchDocListResponse SearchDocList(SearchDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchDocList", SearchDocListResponse.class);
    }

    /**
     *更新知识库
     * @param req UpdateKnowledgeSetRequest
     * @return UpdateKnowledgeSetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateKnowledgeSetResponse UpdateKnowledgeSet(UpdateKnowledgeSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateKnowledgeSet", UpdateKnowledgeSetResponse.class);
    }

    /**
     *更新知识库
     * @param req UploadKnowledgeDocumentSetRequest
     * @return UploadKnowledgeDocumentSetResponse
     * @throws TencentCloudSDKException
     */
    public UploadKnowledgeDocumentSetResponse UploadKnowledgeDocumentSet(UploadKnowledgeDocumentSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadKnowledgeDocumentSet", UploadKnowledgeDocumentSetResponse.class);
    }

}

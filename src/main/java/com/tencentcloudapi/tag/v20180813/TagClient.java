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
package com.tencentcloudapi.tag.v20180813;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tag.v20180813.models.*;

public class TagClient extends AbstractClient{
    private static String endpoint = "tag.tencentcloudapi.com";
    private static String service = "tag";
    private static String version = "2018-08-13";
    
    public TagClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TagClient(Credential credential, String region, ClientProfile profile) {
        super(TagClient.endpoint, TagClient.version, credential, region, profile);
    }

    /**
     *创建项目
     * @param req AddProjectRequest
     * @return AddProjectResponse
     * @throws TencentCloudSDKException
     */
    public AddProjectResponse AddProject(AddProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddProject", AddProjectResponse.class);
    }

    /**
     *本接口用于给标签关联资源
     * @param req AddResourceTagRequest
     * @return AddResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public AddResourceTagResponse AddResourceTag(AddResourceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddResourceTag", AddResourceTagResponse.class);
    }

    /**
     *给多个资源关联某个标签
     * @param req AttachResourcesTagRequest
     * @return AttachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public AttachResourcesTagResponse AttachResourcesTag(AttachResourcesTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachResourcesTag", AttachResourcesTagResponse.class);
    }

    /**
     *本接口用于创建一对标签键和标签值
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTag", CreateTagResponse.class);
    }

    /**
     *本接口用于创建多对标签键和标签值
     * @param req CreateTagsRequest
     * @return CreateTagsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagsResponse CreateTags(CreateTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTags", CreateTagsResponse.class);
    }

    /**
     *本接口用于解除标签和资源的关联关系
     * @param req DeleteResourceTagRequest
     * @return DeleteResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceTagResponse DeleteResourceTag(DeleteResourceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceTag", DeleteResourceTagResponse.class);
    }

    /**
     *本接口用于删除一对标签键和标签值
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTag", DeleteTagResponse.class);
    }

    /**
     *本接口用于批量删除标签键和标签值。
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTags", DeleteTagsResponse.class);
    }

    /**
     *获取项目列表
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *查询资源关联标签
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTags", DescribeResourceTagsResponse.class);
    }

    /**
     *用于批量查询已有资源关联的标签键值对
     * @param req DescribeResourceTagsByResourceIdsRequest
     * @return DescribeResourceTagsByResourceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsResponse DescribeResourceTagsByResourceIds(DescribeResourceTagsByResourceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByResourceIds", DescribeResourceTagsByResourceIdsResponse.class);
    }

    /**
     *按顺序查看资源关联的标签
     * @param req DescribeResourceTagsByResourceIdsSeqRequest
     * @return DescribeResourceTagsByResourceIdsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsSeqResponse DescribeResourceTagsByResourceIdsSeq(DescribeResourceTagsByResourceIdsSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByResourceIdsSeq", DescribeResourceTagsByResourceIdsSeqResponse.class);
    }

    /**
     *根据标签键获取资源标签
     * @param req DescribeResourceTagsByTagKeysRequest
     * @return DescribeResourceTagsByTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByTagKeysResponse DescribeResourceTagsByTagKeys(DescribeResourceTagsByTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByTagKeys", DescribeResourceTagsByTagKeysResponse.class);
    }

    /**
     *通过标签查询资源列表
     * @param req DescribeResourcesByTagsRequest
     * @return DescribeResourcesByTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsResponse DescribeResourcesByTags(DescribeResourcesByTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTags", DescribeResourcesByTagsResponse.class);
    }

    /**
     *通过标签查询资源列表并集
     * @param req DescribeResourcesByTagsUnionRequest
     * @return DescribeResourcesByTagsUnionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsUnionResponse DescribeResourcesByTagsUnion(DescribeResourcesByTagsUnionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTagsUnion", DescribeResourcesByTagsUnionResponse.class);
    }

    /**
     *用于查询已建立的标签列表中的标签键。
     * @param req DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagKeysResponse DescribeTagKeys(DescribeTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagKeys", DescribeTagKeysResponse.class);
    }

    /**
     *用于查询已建立的标签列表中的标签值。
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValues", DescribeTagValuesResponse.class);
    }

    /**
     *用于查询已建立的标签列表中的标签值。
     * @param req DescribeTagValuesSeqRequest
     * @return DescribeTagValuesSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesSeqResponse DescribeTagValuesSeq(DescribeTagValuesSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValuesSeq", DescribeTagValuesSeqResponse.class);
    }

    /**
     *用于查询已建立的标签列表。
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
    }

    /**
     *用于查询已建立的标签列表。

     * @param req DescribeTagsSeqRequest
     * @return DescribeTagsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsSeqResponse DescribeTagsSeq(DescribeTagsSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagsSeq", DescribeTagsSeqResponse.class);
    }

    /**
     *解绑多个资源关联的某个标签
     * @param req DetachResourcesTagRequest
     * @return DetachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public DetachResourcesTagResponse DetachResourcesTag(DetachResourcesTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachResourcesTag", DetachResourcesTagResponse.class);
    }

    /**
     *查询绑定了标签的资源列表。
     * @param req GetResourcesRequest
     * @return GetResourcesResponse
     * @throws TencentCloudSDKException
     */
    public GetResourcesResponse GetResources(GetResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResources", GetResourcesResponse.class);
    }

    /**
     *查询标签键列表。
     * @param req GetTagKeysRequest
     * @return GetTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public GetTagKeysResponse GetTagKeys(GetTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTagKeys", GetTagKeysResponse.class);
    }

    /**
     *用于查询已建立的标签列表中的标签值。
     * @param req GetTagValuesRequest
     * @return GetTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public GetTagValuesResponse GetTagValues(GetTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTagValues", GetTagValuesResponse.class);
    }

    /**
     *用于获取已建立的标签列表。
     * @param req GetTagsRequest
     * @return GetTagsResponse
     * @throws TencentCloudSDKException
     */
    public GetTagsResponse GetTags(GetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTags", GetTagsResponse.class);
    }

    /**
     *本接口用于修改资源关联的所有标签
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceTags", ModifyResourceTagsResponse.class);
    }

    /**
     *修改多个资源关联的某个标签键对应的标签值
     * @param req ModifyResourcesTagValueRequest
     * @return ModifyResourcesTagValueResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagValueResponse ModifyResourcesTagValue(ModifyResourcesTagValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcesTagValue", ModifyResourcesTagValueResponse.class);
    }

    /**
     *为指定的多个云产品的多个云资源统一创建并绑定标签。
     * @param req TagResourcesRequest
     * @return TagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public TagResourcesResponse TagResources(TagResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TagResources", TagResourcesResponse.class);
    }

    /**
     *指定的多个云产品的多个云资源统一解绑标签。
     * @param req UnTagResourcesRequest
     * @return UnTagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public UnTagResourcesResponse UnTagResources(UnTagResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnTagResources", UnTagResourcesResponse.class);
    }

    /**
     *修改项目
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProject", UpdateProjectResponse.class);
    }

    /**
     *本接口用于修改资源已关联的标签值（标签键不变）
     * @param req UpdateResourceTagValueRequest
     * @return UpdateResourceTagValueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceTagValueResponse UpdateResourceTagValue(UpdateResourceTagValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceTagValue", UpdateResourceTagValueResponse.class);
    }

}

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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateContractDiffTaskWebUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 是否跳过文件上传确认页。
当该参数值为`false`时，`OriginalFileResourceId`和`DiffFileResourceId`参数不需要传值，需要在生成的web页面中上传对比文件；
当该参数值为`true`时，`OriginalFileResourceId`和`DiffFileResourceId`参数必填，生成的web页面将跳过上传页面显示对比结果。
    */
    @SerializedName("SkipFileUpload")
    @Expose
    private Boolean SkipFileUpload;

    /**
    * 需要对比的原合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
    */
    @SerializedName("OriginalFileResourceId")
    @Expose
    private String OriginalFileResourceId;

    /**
    * 需要对比的新合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
    */
    @SerializedName("DiffFileResourceId")
    @Expose
    private String DiffFileResourceId;

    /**
    * 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否跳过文件上传确认页。
当该参数值为`false`时，`OriginalFileResourceId`和`DiffFileResourceId`参数不需要传值，需要在生成的web页面中上传对比文件；
当该参数值为`true`时，`OriginalFileResourceId`和`DiffFileResourceId`参数必填，生成的web页面将跳过上传页面显示对比结果。 
     * @return SkipFileUpload 是否跳过文件上传确认页。
当该参数值为`false`时，`OriginalFileResourceId`和`DiffFileResourceId`参数不需要传值，需要在生成的web页面中上传对比文件；
当该参数值为`true`时，`OriginalFileResourceId`和`DiffFileResourceId`参数必填，生成的web页面将跳过上传页面显示对比结果。
     */
    public Boolean getSkipFileUpload() {
        return this.SkipFileUpload;
    }

    /**
     * Set 是否跳过文件上传确认页。
当该参数值为`false`时，`OriginalFileResourceId`和`DiffFileResourceId`参数不需要传值，需要在生成的web页面中上传对比文件；
当该参数值为`true`时，`OriginalFileResourceId`和`DiffFileResourceId`参数必填，生成的web页面将跳过上传页面显示对比结果。
     * @param SkipFileUpload 是否跳过文件上传确认页。
当该参数值为`false`时，`OriginalFileResourceId`和`DiffFileResourceId`参数不需要传值，需要在生成的web页面中上传对比文件；
当该参数值为`true`时，`OriginalFileResourceId`和`DiffFileResourceId`参数必填，生成的web页面将跳过上传页面显示对比结果。
     */
    public void setSkipFileUpload(Boolean SkipFileUpload) {
        this.SkipFileUpload = SkipFileUpload;
    }

    /**
     * Get 需要对比的原合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。 
     * @return OriginalFileResourceId 需要对比的原合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     */
    public String getOriginalFileResourceId() {
        return this.OriginalFileResourceId;
    }

    /**
     * Set 需要对比的原合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     * @param OriginalFileResourceId 需要对比的原合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     */
    public void setOriginalFileResourceId(String OriginalFileResourceId) {
        this.OriginalFileResourceId = OriginalFileResourceId;
    }

    /**
     * Get 需要对比的新合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。 
     * @return DiffFileResourceId 需要对比的新合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     */
    public String getDiffFileResourceId() {
        return this.DiffFileResourceId;
    }

    /**
     * Set 需要对比的新合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     * @param DiffFileResourceId 需要对比的新合同文件资源ID，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。
     */
    public void setDiffFileResourceId(String DiffFileResourceId) {
        this.DiffFileResourceId = DiffFileResourceId;
    }

    /**
     * Get 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。 
     * @return UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     * @param UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。 
     * @return Tags 标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。
     * @param Tags 标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateContractDiffTaskWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateContractDiffTaskWebUrlRequest(CreateContractDiffTaskWebUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SkipFileUpload != null) {
            this.SkipFileUpload = new Boolean(source.SkipFileUpload);
        }
        if (source.OriginalFileResourceId != null) {
            this.OriginalFileResourceId = new String(source.OriginalFileResourceId);
        }
        if (source.DiffFileResourceId != null) {
            this.DiffFileResourceId = new String(source.DiffFileResourceId);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SkipFileUpload", this.SkipFileUpload);
        this.setParamSimple(map, prefix + "OriginalFileResourceId", this.OriginalFileResourceId);
        this.setParamSimple(map, prefix + "DiffFileResourceId", this.DiffFileResourceId);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}


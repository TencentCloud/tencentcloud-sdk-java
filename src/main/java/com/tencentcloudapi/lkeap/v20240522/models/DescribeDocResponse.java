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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocResponse extends AbstractModel {

    /**
    * 文档ID
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 状态，

- Uploading  上传中  
- Auditing 审核中
- Parsing 解析中  
- ParseFailed 解析失败
- Indexing 创建索引中  
- IndexFailed 创建索引失败
- Success  发布成功
- Failed  失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 属性标签
    */
    @SerializedName("AttributeLabels")
    @Expose
    private AttributeLabelReferItem [] AttributeLabels;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文档ID 
     * @return DocId 文档ID
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 文档ID
     * @param DocId 文档ID
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get 状态，

- Uploading  上传中  
- Auditing 审核中
- Parsing 解析中  
- ParseFailed 解析失败
- Indexing 创建索引中  
- IndexFailed 创建索引失败
- Success  发布成功
- Failed  失败 
     * @return Status 状态，

- Uploading  上传中  
- Auditing 审核中
- Parsing 解析中  
- ParseFailed 解析失败
- Indexing 创建索引中  
- IndexFailed 创建索引失败
- Success  发布成功
- Failed  失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，

- Uploading  上传中  
- Auditing 审核中
- Parsing 解析中  
- ParseFailed 解析失败
- Indexing 创建索引中  
- IndexFailed 创建索引失败
- Success  发布成功
- Failed  失败
     * @param Status 状态，

- Uploading  上传中  
- Auditing 审核中
- Parsing 解析中  
- ParseFailed 解析失败
- Indexing 创建索引中  
- IndexFailed 创建索引失败
- Success  发布成功
- Failed  失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 属性标签 
     * @return AttributeLabels 属性标签
     */
    public AttributeLabelReferItem [] getAttributeLabels() {
        return this.AttributeLabels;
    }

    /**
     * Set 属性标签
     * @param AttributeLabels 属性标签
     */
    public void setAttributeLabels(AttributeLabelReferItem [] AttributeLabels) {
        this.AttributeLabels = AttributeLabels;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDocResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocResponse(DescribeDocResponse source) {
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AttributeLabels != null) {
            this.AttributeLabels = new AttributeLabelReferItem[source.AttributeLabels.length];
            for (int i = 0; i < source.AttributeLabels.length; i++) {
                this.AttributeLabels[i] = new AttributeLabelReferItem(source.AttributeLabels[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "AttributeLabels.", this.AttributeLabels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


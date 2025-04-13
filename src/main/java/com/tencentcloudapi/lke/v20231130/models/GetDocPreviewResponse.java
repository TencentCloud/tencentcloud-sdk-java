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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDocPreviewResponse extends AbstractModel {

    /**
    * 文件名, 发布端固定使用这个名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * cos路径

    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * cos临时地址

    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * cos桶

    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 存在文档重命名情况下的新名称, 评测端优先使用这个名称
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
    * 文件md结果cos临时地址
    */
    @SerializedName("ParseResultCosUrl")
    @Expose
    private String ParseResultCosUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件名, 发布端固定使用这个名称 
     * @return FileName 文件名, 发布端固定使用这个名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名, 发布端固定使用这个名称
     * @param FileName 文件名, 发布端固定使用这个名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get cos路径
 
     * @return CosUrl cos路径

     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set cos路径

     * @param CosUrl cos路径

     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get cos临时地址
 
     * @return Url cos临时地址

     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set cos临时地址

     * @param Url cos临时地址

     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get cos桶
 
     * @return Bucket cos桶

     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos桶

     * @param Bucket cos桶

     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 存在文档重命名情况下的新名称, 评测端优先使用这个名称 
     * @return NewName 存在文档重命名情况下的新名称, 评测端优先使用这个名称
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set 存在文档重命名情况下的新名称, 评测端优先使用这个名称
     * @param NewName 存在文档重命名情况下的新名称, 评测端优先使用这个名称
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Get 文件md结果cos临时地址 
     * @return ParseResultCosUrl 文件md结果cos临时地址
     */
    public String getParseResultCosUrl() {
        return this.ParseResultCosUrl;
    }

    /**
     * Set 文件md结果cos临时地址
     * @param ParseResultCosUrl 文件md结果cos临时地址
     */
    public void setParseResultCosUrl(String ParseResultCosUrl) {
        this.ParseResultCosUrl = ParseResultCosUrl;
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

    public GetDocPreviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDocPreviewResponse(GetDocPreviewResponse source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
        if (source.ParseResultCosUrl != null) {
            this.ParseResultCosUrl = new String(source.ParseResultCosUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "ParseResultCosUrl", this.ParseResultCosUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


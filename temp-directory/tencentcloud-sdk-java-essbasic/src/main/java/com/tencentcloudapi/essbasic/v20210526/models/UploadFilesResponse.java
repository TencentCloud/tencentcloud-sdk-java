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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesResponse extends AbstractModel {

    /**
    * 上传成功文件数量
注: `如果一个文件上传失败, 则全部文件皆上传失败`
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 文件资源ID数组，每个文件资源ID为32位字符串。
建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。
注:`有效期一个小时, 有效期内此文件id可以反复使用, 超过有效期无法使用`
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 对应上传文件的下载链接，过期时间5分钟
    */
    @SerializedName("FileUrls")
    @Expose
    private String [] FileUrls;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上传成功文件数量
注: `如果一个文件上传失败, 则全部文件皆上传失败` 
     * @return TotalCount 上传成功文件数量
注: `如果一个文件上传失败, 则全部文件皆上传失败`
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 上传成功文件数量
注: `如果一个文件上传失败, 则全部文件皆上传失败`
     * @param TotalCount 上传成功文件数量
注: `如果一个文件上传失败, 则全部文件皆上传失败`
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 文件资源ID数组，每个文件资源ID为32位字符串。
建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。
注:`有效期一个小时, 有效期内此文件id可以反复使用, 超过有效期无法使用` 
     * @return FileIds 文件资源ID数组，每个文件资源ID为32位字符串。
建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。
注:`有效期一个小时, 有效期内此文件id可以反复使用, 超过有效期无法使用`
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 文件资源ID数组，每个文件资源ID为32位字符串。
建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。
注:`有效期一个小时, 有效期内此文件id可以反复使用, 超过有效期无法使用`
     * @param FileIds 文件资源ID数组，每个文件资源ID为32位字符串。
建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。
注:`有效期一个小时, 有效期内此文件id可以反复使用, 超过有效期无法使用`
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 对应上传文件的下载链接，过期时间5分钟 
     * @return FileUrls 对应上传文件的下载链接，过期时间5分钟
     */
    public String [] getFileUrls() {
        return this.FileUrls;
    }

    /**
     * Set 对应上传文件的下载链接，过期时间5分钟
     * @param FileUrls 对应上传文件的下载链接，过期时间5分钟
     */
    public void setFileUrls(String [] FileUrls) {
        this.FileUrls = FileUrls;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UploadFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesResponse(UploadFilesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FileUrls != null) {
            this.FileUrls = new String[source.FileUrls.length];
            for (int i = 0; i < source.FileUrls.length; i++) {
                this.FileUrls[i] = new String(source.FileUrls[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "FileUrls.", this.FileUrls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


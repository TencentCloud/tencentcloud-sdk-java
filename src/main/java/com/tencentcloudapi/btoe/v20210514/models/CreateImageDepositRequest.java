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
package com.tencentcloudapi.btoe.v20210514.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageDepositRequest extends AbstractModel {

    /**
    * 存证名称(长度最大30)
    */
    @SerializedName("EvidenceName")
    @Expose
    private String EvidenceName;

    /**
    * 数据Base64编码，大小不超过5M
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 带后缀的文件名称，如 test.png
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件hash
    */
    @SerializedName("EvidenceHash")
    @Expose
    private String EvidenceHash;

    /**
    * 业务ID 透传 长度最大不超过64
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 算法类型 0 SM3, 1 SHA256, 2 SHA384 默认0
    */
    @SerializedName("HashType")
    @Expose
    private Long HashType;

    /**
    * 存证描述
    */
    @SerializedName("EvidenceDescription")
    @Expose
    private String EvidenceDescription;

    /**
     * Get 存证名称(长度最大30) 
     * @return EvidenceName 存证名称(长度最大30)
     */
    public String getEvidenceName() {
        return this.EvidenceName;
    }

    /**
     * Set 存证名称(长度最大30)
     * @param EvidenceName 存证名称(长度最大30)
     */
    public void setEvidenceName(String EvidenceName) {
        this.EvidenceName = EvidenceName;
    }

    /**
     * Get 数据Base64编码，大小不超过5M 
     * @return FileContent 数据Base64编码，大小不超过5M
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 数据Base64编码，大小不超过5M
     * @param FileContent 数据Base64编码，大小不超过5M
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 带后缀的文件名称，如 test.png 
     * @return FileName 带后缀的文件名称，如 test.png
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 带后缀的文件名称，如 test.png
     * @param FileName 带后缀的文件名称，如 test.png
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件hash 
     * @return EvidenceHash 文件hash
     */
    public String getEvidenceHash() {
        return this.EvidenceHash;
    }

    /**
     * Set 文件hash
     * @param EvidenceHash 文件hash
     */
    public void setEvidenceHash(String EvidenceHash) {
        this.EvidenceHash = EvidenceHash;
    }

    /**
     * Get 业务ID 透传 长度最大不超过64 
     * @return BusinessId 业务ID 透传 长度最大不超过64
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID 透传 长度最大不超过64
     * @param BusinessId 业务ID 透传 长度最大不超过64
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 算法类型 0 SM3, 1 SHA256, 2 SHA384 默认0 
     * @return HashType 算法类型 0 SM3, 1 SHA256, 2 SHA384 默认0
     */
    public Long getHashType() {
        return this.HashType;
    }

    /**
     * Set 算法类型 0 SM3, 1 SHA256, 2 SHA384 默认0
     * @param HashType 算法类型 0 SM3, 1 SHA256, 2 SHA384 默认0
     */
    public void setHashType(Long HashType) {
        this.HashType = HashType;
    }

    /**
     * Get 存证描述 
     * @return EvidenceDescription 存证描述
     */
    public String getEvidenceDescription() {
        return this.EvidenceDescription;
    }

    /**
     * Set 存证描述
     * @param EvidenceDescription 存证描述
     */
    public void setEvidenceDescription(String EvidenceDescription) {
        this.EvidenceDescription = EvidenceDescription;
    }

    public CreateImageDepositRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageDepositRequest(CreateImageDepositRequest source) {
        if (source.EvidenceName != null) {
            this.EvidenceName = new String(source.EvidenceName);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.EvidenceHash != null) {
            this.EvidenceHash = new String(source.EvidenceHash);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.HashType != null) {
            this.HashType = new Long(source.HashType);
        }
        if (source.EvidenceDescription != null) {
            this.EvidenceDescription = new String(source.EvidenceDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvidenceName", this.EvidenceName);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "EvidenceHash", this.EvidenceHash);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "HashType", this.HashType);
        this.setParamSimple(map, prefix + "EvidenceDescription", this.EvidenceDescription);

    }
}


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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestLocalTaskResponse extends AbstractModel{

    /**
    * 返回的任务id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 任务文件的mk5
    */
    @SerializedName("SrcFileMd5")
    @Expose
    private String SrcFileMd5;

    /**
    * 文件大小，可不传
    */
    @SerializedName("SrcFileSize")
    @Expose
    private Long SrcFileSize;

    /**
    * 任务文件的下载地址，必须无鉴权可下载
    */
    @SerializedName("SrcFileUrl")
    @Expose
    private String SrcFileUrl;

    /**
    * release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
    */
    @SerializedName("SrcFileType")
    @Expose
    private String SrcFileType;

    /**
    * enterprise
trial
    */
    @SerializedName("SrcFileVersion")
    @Expose
    private String SrcFileVersion;

    /**
    * 补充字段
    */
    @SerializedName("EncryptParam")
    @Expose
    private String EncryptParam;

    /**
    * 任务状态
    */
    @SerializedName("EncryptState")
    @Expose
    private Long EncryptState;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的任务id 
     * @return Sid 返回的任务id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 返回的任务id
     * @param Sid 返回的任务id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 任务文件的mk5 
     * @return SrcFileMd5 任务文件的mk5
     */
    public String getSrcFileMd5() {
        return this.SrcFileMd5;
    }

    /**
     * Set 任务文件的mk5
     * @param SrcFileMd5 任务文件的mk5
     */
    public void setSrcFileMd5(String SrcFileMd5) {
        this.SrcFileMd5 = SrcFileMd5;
    }

    /**
     * Get 文件大小，可不传 
     * @return SrcFileSize 文件大小，可不传
     */
    public Long getSrcFileSize() {
        return this.SrcFileSize;
    }

    /**
     * Set 文件大小，可不传
     * @param SrcFileSize 文件大小，可不传
     */
    public void setSrcFileSize(Long SrcFileSize) {
        this.SrcFileSize = SrcFileSize;
    }

    /**
     * Get 任务文件的下载地址，必须无鉴权可下载 
     * @return SrcFileUrl 任务文件的下载地址，必须无鉴权可下载
     */
    public String getSrcFileUrl() {
        return this.SrcFileUrl;
    }

    /**
     * Set 任务文件的下载地址，必须无鉴权可下载
     * @param SrcFileUrl 任务文件的下载地址，必须无鉴权可下载
     */
    public void setSrcFileUrl(String SrcFileUrl) {
        this.SrcFileUrl = SrcFileUrl;
    }

    /**
     * Get release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器 
     * @return SrcFileType release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     */
    public String getSrcFileType() {
        return this.SrcFileType;
    }

    /**
     * Set release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     * @param SrcFileType release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     */
    public void setSrcFileType(String SrcFileType) {
        this.SrcFileType = SrcFileType;
    }

    /**
     * Get enterprise
trial 
     * @return SrcFileVersion enterprise
trial
     */
    public String getSrcFileVersion() {
        return this.SrcFileVersion;
    }

    /**
     * Set enterprise
trial
     * @param SrcFileVersion enterprise
trial
     */
    public void setSrcFileVersion(String SrcFileVersion) {
        this.SrcFileVersion = SrcFileVersion;
    }

    /**
     * Get 补充字段 
     * @return EncryptParam 补充字段
     */
    public String getEncryptParam() {
        return this.EncryptParam;
    }

    /**
     * Set 补充字段
     * @param EncryptParam 补充字段
     */
    public void setEncryptParam(String EncryptParam) {
        this.EncryptParam = EncryptParam;
    }

    /**
     * Get 任务状态 
     * @return EncryptState 任务状态
     */
    public Long getEncryptState() {
        return this.EncryptState;
    }

    /**
     * Set 任务状态
     * @param EncryptState 任务状态
     */
    public void setEncryptState(Long EncryptState) {
        this.EncryptState = EncryptState;
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

    public RequestLocalTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestLocalTaskResponse(RequestLocalTaskResponse source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.SrcFileMd5 != null) {
            this.SrcFileMd5 = new String(source.SrcFileMd5);
        }
        if (source.SrcFileSize != null) {
            this.SrcFileSize = new Long(source.SrcFileSize);
        }
        if (source.SrcFileUrl != null) {
            this.SrcFileUrl = new String(source.SrcFileUrl);
        }
        if (source.SrcFileType != null) {
            this.SrcFileType = new String(source.SrcFileType);
        }
        if (source.SrcFileVersion != null) {
            this.SrcFileVersion = new String(source.SrcFileVersion);
        }
        if (source.EncryptParam != null) {
            this.EncryptParam = new String(source.EncryptParam);
        }
        if (source.EncryptState != null) {
            this.EncryptState = new Long(source.EncryptState);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "SrcFileMd5", this.SrcFileMd5);
        this.setParamSimple(map, prefix + "SrcFileSize", this.SrcFileSize);
        this.setParamSimple(map, prefix + "SrcFileUrl", this.SrcFileUrl);
        this.setParamSimple(map, prefix + "SrcFileType", this.SrcFileType);
        this.setParamSimple(map, prefix + "SrcFileVersion", this.SrcFileVersion);
        this.setParamSimple(map, prefix + "EncryptParam", this.EncryptParam);
        this.setParamSimple(map, prefix + "EncryptState", this.EncryptState);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


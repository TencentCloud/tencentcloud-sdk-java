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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckFaceIdentifyResponse extends AbstractModel{

    /**
    * 核身结果; 0:通过,1:不通过
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 核身结果描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 渠道名
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 认证通过时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifiedOn")
    @Expose
    private Long VerifiedOn;

    /**
    * 核身流水号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 渠道核身服务器IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyServerIp")
    @Expose
    private String VerifyServerIp;

    /**
    * 核身照片文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhotoFileName")
    @Expose
    private String PhotoFileName;

    /**
    * 核身照片内容base64(文件格式见文件名后缀,一般为jpg)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhotoFileData")
    @Expose
    private String PhotoFileData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核身结果; 0:通过,1:不通过 
     * @return Result 核身结果; 0:通过,1:不通过
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 核身结果; 0:通过,1:不通过
     * @param Result 核身结果; 0:通过,1:不通过
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 核身结果描述 
     * @return Description 核身结果描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 核身结果描述
     * @param Description 核身结果描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 渠道名 
     * @return ChannelName 渠道名
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名
     * @param ChannelName 渠道名
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 认证通过时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifiedOn 认证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVerifiedOn() {
        return this.VerifiedOn;
    }

    /**
     * Set 认证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifiedOn 认证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifiedOn(Long VerifiedOn) {
        this.VerifiedOn = VerifiedOn;
    }

    /**
     * Get 核身流水号 
     * @return SerialNumber 核身流水号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 核身流水号
     * @param SerialNumber 核身流水号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 渠道核身服务器IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyServerIp 渠道核身服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyServerIp() {
        return this.VerifyServerIp;
    }

    /**
     * Set 渠道核身服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyServerIp 渠道核身服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyServerIp(String VerifyServerIp) {
        this.VerifyServerIp = VerifyServerIp;
    }

    /**
     * Get 核身照片文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhotoFileName 核身照片文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhotoFileName() {
        return this.PhotoFileName;
    }

    /**
     * Set 核身照片文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhotoFileName 核身照片文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhotoFileName(String PhotoFileName) {
        this.PhotoFileName = PhotoFileName;
    }

    /**
     * Get 核身照片内容base64(文件格式见文件名后缀,一般为jpg)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhotoFileData 核身照片内容base64(文件格式见文件名后缀,一般为jpg)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhotoFileData() {
        return this.PhotoFileData;
    }

    /**
     * Set 核身照片内容base64(文件格式见文件名后缀,一般为jpg)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhotoFileData 核身照片内容base64(文件格式见文件名后缀,一般为jpg)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhotoFileData(String PhotoFileData) {
        this.PhotoFileData = PhotoFileData;
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

    public CheckFaceIdentifyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFaceIdentifyResponse(CheckFaceIdentifyResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.VerifiedOn != null) {
            this.VerifiedOn = new Long(source.VerifiedOn);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.VerifyServerIp != null) {
            this.VerifyServerIp = new String(source.VerifyServerIp);
        }
        if (source.PhotoFileName != null) {
            this.PhotoFileName = new String(source.PhotoFileName);
        }
        if (source.PhotoFileData != null) {
            this.PhotoFileData = new String(source.PhotoFileData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "VerifiedOn", this.VerifiedOn);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "VerifyServerIp", this.VerifyServerIp);
        this.setParamSimple(map, prefix + "PhotoFileName", this.PhotoFileName);
        this.setParamSimple(map, prefix + "PhotoFileData", this.PhotoFileData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


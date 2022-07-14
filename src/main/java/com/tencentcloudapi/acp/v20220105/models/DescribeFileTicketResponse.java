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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileTicketResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 上传url(任务来源为2时:Post方法（100:apk,101:txt）, 任务来源为1时:put方法)
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 上传url鉴权信息(任务来源为1时上传需要, Authorization参数值)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadSign")
    @Expose
    private String UploadSign;

    /**
    * 上传文件ID(任务来源为1时提交诊断任务需要)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FildID")
    @Expose
    private String FildID;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 上传url(任务来源为2时:Post方法（100:apk,101:txt）, 任务来源为1时:put方法) 
     * @return UploadUrl 上传url(任务来源为2时:Post方法（100:apk,101:txt）, 任务来源为1时:put方法)
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 上传url(任务来源为2时:Post方法（100:apk,101:txt）, 任务来源为1时:put方法)
     * @param UploadUrl 上传url(任务来源为2时:Post方法（100:apk,101:txt）, 任务来源为1时:put方法)
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get 上传url鉴权信息(任务来源为1时上传需要, Authorization参数值)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadSign 上传url鉴权信息(任务来源为1时上传需要, Authorization参数值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadSign() {
        return this.UploadSign;
    }

    /**
     * Set 上传url鉴权信息(任务来源为1时上传需要, Authorization参数值)
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadSign 上传url鉴权信息(任务来源为1时上传需要, Authorization参数值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadSign(String UploadSign) {
        this.UploadSign = UploadSign;
    }

    /**
     * Get 上传文件ID(任务来源为1时提交诊断任务需要)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FildID 上传文件ID(任务来源为1时提交诊断任务需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFildID() {
        return this.FildID;
    }

    /**
     * Set 上传文件ID(任务来源为1时提交诊断任务需要)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FildID 上传文件ID(任务来源为1时提交诊断任务需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFildID(String FildID) {
        this.FildID = FildID;
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

    public DescribeFileTicketResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileTicketResponse(DescribeFileTicketResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.UploadSign != null) {
            this.UploadSign = new String(source.UploadSign);
        }
        if (source.FildID != null) {
            this.FildID = new String(source.FildID);
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
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "UploadSign", this.UploadSign);
        this.setParamSimple(map, prefix + "FildID", this.FildID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


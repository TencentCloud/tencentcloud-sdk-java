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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlySecMiniAppScanTaskStatusResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Ret")
    @Expose
    private Long Ret;

    /**
    * 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 诊断失败错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errno")
    @Expose
    private Long Errno;

    /**
    * 小程序名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniAppName")
    @Expose
    private String MiniAppName;

    /**
    * 小程序版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniAppVersion")
    @Expose
    private String MiniAppVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getRet() {
        return this.Ret;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setRet(Long Ret) {
        this.Ret = Ret;
    }

    /**
     * Get 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中 
     * @return Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     * @param Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 诊断失败错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errno 诊断失败错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrno() {
        return this.Errno;
    }

    /**
     * Set 诊断失败错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errno 诊断失败错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrno(Long Errno) {
        this.Errno = Errno;
    }

    /**
     * Get 小程序名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniAppName 小程序名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniAppName() {
        return this.MiniAppName;
    }

    /**
     * Set 小程序名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniAppName 小程序名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniAppName(String MiniAppName) {
        this.MiniAppName = MiniAppName;
    }

    /**
     * Get 小程序版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniAppVersion 小程序版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniAppVersion() {
        return this.MiniAppVersion;
    }

    /**
     * Set 小程序版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniAppVersion 小程序版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniAppVersion(String MiniAppVersion) {
        this.MiniAppVersion = MiniAppVersion;
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

    public DescribeFlySecMiniAppScanTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlySecMiniAppScanTaskStatusResponse(DescribeFlySecMiniAppScanTaskStatusResponse source) {
        if (source.Ret != null) {
            this.Ret = new Long(source.Ret);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Errno != null) {
            this.Errno = new Long(source.Errno);
        }
        if (source.MiniAppName != null) {
            this.MiniAppName = new String(source.MiniAppName);
        }
        if (source.MiniAppVersion != null) {
            this.MiniAppVersion = new String(source.MiniAppVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ret", this.Ret);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Errno", this.Errno);
        this.setParamSimple(map, prefix + "MiniAppName", this.MiniAppName);
        this.setParamSimple(map, prefix + "MiniAppVersion", this.MiniAppVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


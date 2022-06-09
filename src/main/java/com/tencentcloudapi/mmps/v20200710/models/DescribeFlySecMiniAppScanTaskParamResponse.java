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

public class DescribeFlySecMiniAppScanTaskParamResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Ret")
    @Expose
    private Long Ret;

    /**
    * 小程序AppID
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 诊断模式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 小程序测试账号(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniAppTestAccount")
    @Expose
    private String MiniAppTestAccount;

    /**
    * 小程序测试密码(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniAppTestPwd")
    @Expose
    private String MiniAppTestPwd;

    /**
    * 诊断扫描版本 0:正式版 1:体验版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVersion")
    @Expose
    private Long ScanVersion;

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
     * Get 小程序AppID 
     * @return MiniAppID 小程序AppID
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序AppID
     * @param MiniAppID 小程序AppID
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 诊断模式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断模式 1:基础诊断，2:深度诊断
     * @param Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 小程序测试账号(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniAppTestAccount() {
        return this.MiniAppTestAccount;
    }

    /**
     * Set 小程序测试账号(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniAppTestAccount(String MiniAppTestAccount) {
        this.MiniAppTestAccount = MiniAppTestAccount;
    }

    /**
     * Get 小程序测试密码(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniAppTestPwd() {
        return this.MiniAppTestPwd;
    }

    /**
     * Set 小程序测试密码(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniAppTestPwd(String MiniAppTestPwd) {
        this.MiniAppTestPwd = MiniAppTestPwd;
    }

    /**
     * Get 诊断扫描版本 0:正式版 1:体验版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVersion 诊断扫描版本 0:正式版 1:体验版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanVersion() {
        return this.ScanVersion;
    }

    /**
     * Set 诊断扫描版本 0:正式版 1:体验版
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVersion 诊断扫描版本 0:正式版 1:体验版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVersion(Long ScanVersion) {
        this.ScanVersion = ScanVersion;
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

    public DescribeFlySecMiniAppScanTaskParamResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlySecMiniAppScanTaskParamResponse(DescribeFlySecMiniAppScanTaskParamResponse source) {
        if (source.Ret != null) {
            this.Ret = new Long(source.Ret);
        }
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.MiniAppTestAccount != null) {
            this.MiniAppTestAccount = new String(source.MiniAppTestAccount);
        }
        if (source.MiniAppTestPwd != null) {
            this.MiniAppTestPwd = new String(source.MiniAppTestPwd);
        }
        if (source.ScanVersion != null) {
            this.ScanVersion = new Long(source.ScanVersion);
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
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MiniAppTestAccount", this.MiniAppTestAccount);
        this.setParamSimple(map, prefix + "MiniAppTestPwd", this.MiniAppTestPwd);
        this.setParamSimple(map, prefix + "ScanVersion", this.ScanVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


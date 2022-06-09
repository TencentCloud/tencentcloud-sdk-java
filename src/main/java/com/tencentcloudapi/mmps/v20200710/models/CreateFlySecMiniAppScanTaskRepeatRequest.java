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

public class CreateFlySecMiniAppScanTaskRepeatRequest extends AbstractModel{

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
    * 原任务id
    */
    @SerializedName("OrgTaskID")
    @Expose
    private String OrgTaskID;

    /**
    * 小程序测试账号(自有账号体系需提供,其他情况不需要)
    */
    @SerializedName("MiniAppTestAccount")
    @Expose
    private String MiniAppTestAccount;

    /**
    * 小程序测试密码(自有账号体系需提供,其他情况不需要)
    */
    @SerializedName("MiniAppTestPwd")
    @Expose
    private String MiniAppTestPwd;

    /**
    * 诊断扫描版本 0:正式版 1:体验版
    */
    @SerializedName("ScanVersion")
    @Expose
    private Long ScanVersion;

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
     * Get 原任务id 
     * @return OrgTaskID 原任务id
     */
    public String getOrgTaskID() {
        return this.OrgTaskID;
    }

    /**
     * Set 原任务id
     * @param OrgTaskID 原任务id
     */
    public void setOrgTaskID(String OrgTaskID) {
        this.OrgTaskID = OrgTaskID;
    }

    /**
     * Get 小程序测试账号(自有账号体系需提供,其他情况不需要) 
     * @return MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
     */
    public String getMiniAppTestAccount() {
        return this.MiniAppTestAccount;
    }

    /**
     * Set 小程序测试账号(自有账号体系需提供,其他情况不需要)
     * @param MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
     */
    public void setMiniAppTestAccount(String MiniAppTestAccount) {
        this.MiniAppTestAccount = MiniAppTestAccount;
    }

    /**
     * Get 小程序测试密码(自有账号体系需提供,其他情况不需要) 
     * @return MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
     */
    public String getMiniAppTestPwd() {
        return this.MiniAppTestPwd;
    }

    /**
     * Set 小程序测试密码(自有账号体系需提供,其他情况不需要)
     * @param MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
     */
    public void setMiniAppTestPwd(String MiniAppTestPwd) {
        this.MiniAppTestPwd = MiniAppTestPwd;
    }

    /**
     * Get 诊断扫描版本 0:正式版 1:体验版 
     * @return ScanVersion 诊断扫描版本 0:正式版 1:体验版
     */
    public Long getScanVersion() {
        return this.ScanVersion;
    }

    /**
     * Set 诊断扫描版本 0:正式版 1:体验版
     * @param ScanVersion 诊断扫描版本 0:正式版 1:体验版
     */
    public void setScanVersion(Long ScanVersion) {
        this.ScanVersion = ScanVersion;
    }

    public CreateFlySecMiniAppScanTaskRepeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlySecMiniAppScanTaskRepeatRequest(CreateFlySecMiniAppScanTaskRepeatRequest source) {
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.OrgTaskID != null) {
            this.OrgTaskID = new String(source.OrgTaskID);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "OrgTaskID", this.OrgTaskID);
        this.setParamSimple(map, prefix + "MiniAppTestAccount", this.MiniAppTestAccount);
        this.setParamSimple(map, prefix + "MiniAppTestPwd", this.MiniAppTestPwd);
        this.setParamSimple(map, prefix + "ScanVersion", this.ScanVersion);

    }
}


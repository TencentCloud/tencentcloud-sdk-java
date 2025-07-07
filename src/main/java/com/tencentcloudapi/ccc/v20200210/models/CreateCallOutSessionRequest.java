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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCallOutSessionRequest extends AbstractModel {

    /**
    * 应用 ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 客服用户 ID，一般为客服邮箱，确保已经绑定了手机号 https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 被叫号码，须带 0086 前缀
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 主叫号码（废弃，使用Callers），须带 0086 前缀
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * 指定主叫号码列表，如果前面的号码失败了会自动换成下一个号码，须带 0086 前缀
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4
    */
    @SerializedName("IsForceUseMobile")
    @Expose
    private Boolean IsForceUseMobile;

    /**
    * 自定义数据，长度限制 1024 字节
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * 自定义数据，长度限制 1024 字节
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
     * Get 应用 ID 
     * @return SdkAppId 应用 ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID
     * @param SdkAppId 应用 ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 客服用户 ID，一般为客服邮箱，确保已经绑定了手机号 https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF 
     * @return UserId 客服用户 ID，一般为客服邮箱，确保已经绑定了手机号 https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 客服用户 ID，一般为客服邮箱，确保已经绑定了手机号 https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF
     * @param UserId 客服用户 ID，一般为客服邮箱，确保已经绑定了手机号 https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 被叫号码，须带 0086 前缀 
     * @return Callee 被叫号码，须带 0086 前缀
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码，须带 0086 前缀
     * @param Callee 被叫号码，须带 0086 前缀
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 主叫号码（废弃，使用Callers），须带 0086 前缀 
     * @return Caller 主叫号码（废弃，使用Callers），须带 0086 前缀
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set 主叫号码（废弃，使用Callers），须带 0086 前缀
     * @param Caller 主叫号码（废弃，使用Callers），须带 0086 前缀
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 指定主叫号码列表，如果前面的号码失败了会自动换成下一个号码，须带 0086 前缀 
     * @return Callers 指定主叫号码列表，如果前面的号码失败了会自动换成下一个号码，须带 0086 前缀
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 指定主叫号码列表，如果前面的号码失败了会自动换成下一个号码，须带 0086 前缀
     * @param Callers 指定主叫号码列表，如果前面的号码失败了会自动换成下一个号码，须带 0086 前缀
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4 
     * @return IsForceUseMobile 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4
     */
    public Boolean getIsForceUseMobile() {
        return this.IsForceUseMobile;
    }

    /**
     * Set 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4
     * @param IsForceUseMobile 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4
     */
    public void setIsForceUseMobile(Boolean IsForceUseMobile) {
        this.IsForceUseMobile = IsForceUseMobile;
    }

    /**
     * Get 自定义数据，长度限制 1024 字节 
     * @return Uui 自定义数据，长度限制 1024 字节
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set 自定义数据，长度限制 1024 字节
     * @param Uui 自定义数据，长度限制 1024 字节
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    /**
     * Get 自定义数据，长度限制 1024 字节 
     * @return UUI 自定义数据，长度限制 1024 字节
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 自定义数据，长度限制 1024 字节
     * @param UUI 自定义数据，长度限制 1024 字节
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    public CreateCallOutSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCallOutSessionRequest(CreateCallOutSessionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.IsForceUseMobile != null) {
            this.IsForceUseMobile = new Boolean(source.IsForceUseMobile);
        }
        if (source.Uui != null) {
            this.Uui = new String(source.Uui);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "IsForceUseMobile", this.IsForceUseMobile);
        this.setParamSimple(map, prefix + "Uui", this.Uui);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}


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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDetectInfoRequest  extends AbstractModel{

    /**
    * 业务流水号
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * 规则Id。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 指定需要拉取何种信息（0：全部；1：文本类；2：身份证正反面；3：截帧（最佳帧）；4：视频）。可拼接。如 134表示拉取文本类、截帧（最佳帧）、视频
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
     * 获取业务流水号
     * @return BizToken 业务流水号
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * 设置业务流水号
     * @param BizToken 业务流水号
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * 获取规则Id。
     * @return RuleId 规则Id。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则Id。
     * @param RuleId 规则Id。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取指定需要拉取何种信息（0：全部；1：文本类；2：身份证正反面；3：截帧（最佳帧）；4：视频）。可拼接。如 134表示拉取文本类、截帧（最佳帧）、视频
     * @return InfoType 指定需要拉取何种信息（0：全部；1：文本类；2：身份证正反面；3：截帧（最佳帧）；4：视频）。可拼接。如 134表示拉取文本类、截帧（最佳帧）、视频
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * 设置指定需要拉取何种信息（0：全部；1：文本类；2：身份证正反面；3：截帧（最佳帧）；4：视频）。可拼接。如 134表示拉取文本类、截帧（最佳帧）、视频
     * @param InfoType 指定需要拉取何种信息（0：全部；1：文本类；2：身份证正反面；3：截帧（最佳帧）；4：视频）。可拼接。如 134表示拉取文本类、截帧（最佳帧）、视频
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);

    }
}


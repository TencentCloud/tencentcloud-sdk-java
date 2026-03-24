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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillState extends AbstractModel {

    /**
    * SKILL安装状态
枚举值：
0：未安装
1：安装中
2：已安装
3：安装失败
4：卸载中
5：卸载失败
    */
    @SerializedName("SkillInstallStatus")
    @Expose
    private Long SkillInstallStatus;

    /**
    * SKILL安装/卸载操作时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("SkillInstallTime")
    @Expose
    private String SkillInstallTime;

    /**
    * SKILL安装/卸载结果描述信息
    */
    @SerializedName("SkillInstallResult")
    @Expose
    private String SkillInstallResult;

    /**
     * Get SKILL安装状态
枚举值：
0：未安装
1：安装中
2：已安装
3：安装失败
4：卸载中
5：卸载失败 
     * @return SkillInstallStatus SKILL安装状态
枚举值：
0：未安装
1：安装中
2：已安装
3：安装失败
4：卸载中
5：卸载失败
     */
    public Long getSkillInstallStatus() {
        return this.SkillInstallStatus;
    }

    /**
     * Set SKILL安装状态
枚举值：
0：未安装
1：安装中
2：已安装
3：安装失败
4：卸载中
5：卸载失败
     * @param SkillInstallStatus SKILL安装状态
枚举值：
0：未安装
1：安装中
2：已安装
3：安装失败
4：卸载中
5：卸载失败
     */
    public void setSkillInstallStatus(Long SkillInstallStatus) {
        this.SkillInstallStatus = SkillInstallStatus;
    }

    /**
     * Get SKILL安装/卸载操作时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return SkillInstallTime SKILL安装/卸载操作时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getSkillInstallTime() {
        return this.SkillInstallTime;
    }

    /**
     * Set SKILL安装/卸载操作时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param SkillInstallTime SKILL安装/卸载操作时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setSkillInstallTime(String SkillInstallTime) {
        this.SkillInstallTime = SkillInstallTime;
    }

    /**
     * Get SKILL安装/卸载结果描述信息 
     * @return SkillInstallResult SKILL安装/卸载结果描述信息
     */
    public String getSkillInstallResult() {
        return this.SkillInstallResult;
    }

    /**
     * Set SKILL安装/卸载结果描述信息
     * @param SkillInstallResult SKILL安装/卸载结果描述信息
     */
    public void setSkillInstallResult(String SkillInstallResult) {
        this.SkillInstallResult = SkillInstallResult;
    }

    public SkillState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillState(SkillState source) {
        if (source.SkillInstallStatus != null) {
            this.SkillInstallStatus = new Long(source.SkillInstallStatus);
        }
        if (source.SkillInstallTime != null) {
            this.SkillInstallTime = new String(source.SkillInstallTime);
        }
        if (source.SkillInstallResult != null) {
            this.SkillInstallResult = new String(source.SkillInstallResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillInstallStatus", this.SkillInstallStatus);
        this.setParamSimple(map, prefix + "SkillInstallTime", this.SkillInstallTime);
        this.setParamSimple(map, prefix + "SkillInstallResult", this.SkillInstallResult);

    }
}


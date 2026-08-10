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

public class VPRRatingInfo extends AbstractModel {

    /**
    * VPR 评级结果
枚举值：
URGENT：立即修复
SUGGESTED：建议修复
DEFERRABLE：可延迟修复
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 评级说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 分阶段评级详情列表
    */
    @SerializedName("Stage")
    @Expose
    private VPRRatingStage [] Stage;

    /**
     * Get VPR 评级结果
枚举值：
URGENT：立即修复
SUGGESTED：建议修复
DEFERRABLE：可延迟修复 
     * @return Result VPR 评级结果
枚举值：
URGENT：立即修复
SUGGESTED：建议修复
DEFERRABLE：可延迟修复
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set VPR 评级结果
枚举值：
URGENT：立即修复
SUGGESTED：建议修复
DEFERRABLE：可延迟修复
     * @param Result VPR 评级结果
枚举值：
URGENT：立即修复
SUGGESTED：建议修复
DEFERRABLE：可延迟修复
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 评级说明 
     * @return Remark 评级说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 评级说明
     * @param Remark 评级说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 分阶段评级详情列表 
     * @return Stage 分阶段评级详情列表
     */
    public VPRRatingStage [] getStage() {
        return this.Stage;
    }

    /**
     * Set 分阶段评级详情列表
     * @param Stage 分阶段评级详情列表
     */
    public void setStage(VPRRatingStage [] Stage) {
        this.Stage = Stage;
    }

    public VPRRatingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRRatingInfo(VPRRatingInfo source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Stage != null) {
            this.Stage = new VPRRatingStage[source.Stage.length];
            for (int i = 0; i < source.Stage.length; i++) {
                this.Stage[i] = new VPRRatingStage(source.Stage[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Stage.", this.Stage);

    }
}


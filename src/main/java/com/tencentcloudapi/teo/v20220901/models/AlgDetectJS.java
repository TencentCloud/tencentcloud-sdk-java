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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgDetectJS extends AbstractModel{

    /**
    * 操作名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作量证明 (proof_Of-Work)校验强度，默认low，取值有：
<li>low：低；</li>
<li>middle：中；</li>
<li>high：高。</li>
    */
    @SerializedName("WorkLevel")
    @Expose
    private String WorkLevel;

    /**
    * 执行方式，js延迟执行的时间。单位为ms，默认500，取值：0～1000。
    */
    @SerializedName("ExecuteMode")
    @Expose
    private Long ExecuteMode;

    /**
    * 客户端末启用JS（末完成检测）统计周期。单位为秒，默认10，取值：5～3600。
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * 客户端末启用JS（末完成检测）触发阈值。单位为次，默认300，取值：1～100000000。
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Bot主动特征识别客户端行为校验结果。
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
     * Get 操作名称。 
     * @return Name 操作名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 操作名称。
     * @param Name 操作名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工作量证明 (proof_Of-Work)校验强度，默认low，取值有：
<li>low：低；</li>
<li>middle：中；</li>
<li>high：高。</li> 
     * @return WorkLevel 工作量证明 (proof_Of-Work)校验强度，默认low，取值有：
<li>low：低；</li>
<li>middle：中；</li>
<li>high：高。</li>
     */
    public String getWorkLevel() {
        return this.WorkLevel;
    }

    /**
     * Set 工作量证明 (proof_Of-Work)校验强度，默认low，取值有：
<li>low：低；</li>
<li>middle：中；</li>
<li>high：高。</li>
     * @param WorkLevel 工作量证明 (proof_Of-Work)校验强度，默认low，取值有：
<li>low：低；</li>
<li>middle：中；</li>
<li>high：高。</li>
     */
    public void setWorkLevel(String WorkLevel) {
        this.WorkLevel = WorkLevel;
    }

    /**
     * Get 执行方式，js延迟执行的时间。单位为ms，默认500，取值：0～1000。 
     * @return ExecuteMode 执行方式，js延迟执行的时间。单位为ms，默认500，取值：0～1000。
     */
    public Long getExecuteMode() {
        return this.ExecuteMode;
    }

    /**
     * Set 执行方式，js延迟执行的时间。单位为ms，默认500，取值：0～1000。
     * @param ExecuteMode 执行方式，js延迟执行的时间。单位为ms，默认500，取值：0～1000。
     */
    public void setExecuteMode(Long ExecuteMode) {
        this.ExecuteMode = ExecuteMode;
    }

    /**
     * Get 客户端末启用JS（末完成检测）统计周期。单位为秒，默认10，取值：5～3600。 
     * @return InvalidStatTime 客户端末启用JS（末完成检测）统计周期。单位为秒，默认10，取值：5～3600。
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set 客户端末启用JS（末完成检测）统计周期。单位为秒，默认10，取值：5～3600。
     * @param InvalidStatTime 客户端末启用JS（末完成检测）统计周期。单位为秒，默认10，取值：5～3600。
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get 客户端末启用JS（末完成检测）触发阈值。单位为次，默认300，取值：1～100000000。 
     * @return InvalidThreshold 客户端末启用JS（末完成检测）触发阈值。单位为次，默认300，取值：1～100000000。
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set 客户端末启用JS（末完成检测）触发阈值。单位为次，默认300，取值：1～100000000。
     * @param InvalidThreshold 客户端末启用JS（末完成检测）触发阈值。单位为次，默认300，取值：1～100000000。
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Bot主动特征识别客户端行为校验结果。 
     * @return AlgDetectResults Bot主动特征识别客户端行为校验结果。
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Bot主动特征识别客户端行为校验结果。
     * @param AlgDetectResults Bot主动特征识别客户端行为校验结果。
     */
    public void setAlgDetectResults(AlgDetectResult [] AlgDetectResults) {
        this.AlgDetectResults = AlgDetectResults;
    }

    public AlgDetectJS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectJS(AlgDetectJS source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WorkLevel != null) {
            this.WorkLevel = new String(source.WorkLevel);
        }
        if (source.ExecuteMode != null) {
            this.ExecuteMode = new Long(source.ExecuteMode);
        }
        if (source.InvalidStatTime != null) {
            this.InvalidStatTime = new Long(source.InvalidStatTime);
        }
        if (source.InvalidThreshold != null) {
            this.InvalidThreshold = new Long(source.InvalidThreshold);
        }
        if (source.AlgDetectResults != null) {
            this.AlgDetectResults = new AlgDetectResult[source.AlgDetectResults.length];
            for (int i = 0; i < source.AlgDetectResults.length; i++) {
                this.AlgDetectResults[i] = new AlgDetectResult(source.AlgDetectResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WorkLevel", this.WorkLevel);
        this.setParamSimple(map, prefix + "ExecuteMode", this.ExecuteMode);
        this.setParamSimple(map, prefix + "InvalidStatTime", this.InvalidStatTime);
        this.setParamSimple(map, prefix + "InvalidThreshold", this.InvalidThreshold);
        this.setParamArrayObj(map, prefix + "AlgDetectResults.", this.AlgDetectResults);

    }
}


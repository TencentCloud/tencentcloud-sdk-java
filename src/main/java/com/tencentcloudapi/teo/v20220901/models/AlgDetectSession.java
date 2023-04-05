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

public class AlgDetectSession extends AbstractModel{

    /**
    * 操作名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 校验方式，默认update_detect，取值有：
<li>detect：仅校验；</li>
<li>update_detect：更新Cookie并校验。</li>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * 会话速率和周期特征校验开关，默认off，取值有：
<li>off：关闭；</li>
<li>on：打开。</li>
    */
    @SerializedName("SessionAnalyzeSwitch")
    @Expose
    private String SessionAnalyzeSwitch;

    /**
    * 校验结果为未携带Cookie或Cookie已过期的统计周期。单位为秒，默认10，取值：5～3600。
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * 校验结果为未携带Cookie或Cookie已过期的触发阈值。单位为次，默认300，取值：1～100000000。
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Cookie校验校验结果。
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
    * 会话速率和周期特征校验结果。
    */
    @SerializedName("SessionBehaviors")
    @Expose
    private AlgDetectResult [] SessionBehaviors;

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
     * Get 校验方式，默认update_detect，取值有：
<li>detect：仅校验；</li>
<li>update_detect：更新Cookie并校验。</li> 
     * @return DetectMode 校验方式，默认update_detect，取值有：
<li>detect：仅校验；</li>
<li>update_detect：更新Cookie并校验。</li>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set 校验方式，默认update_detect，取值有：
<li>detect：仅校验；</li>
<li>update_detect：更新Cookie并校验。</li>
     * @param DetectMode 校验方式，默认update_detect，取值有：
<li>detect：仅校验；</li>
<li>update_detect：更新Cookie并校验。</li>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get 会话速率和周期特征校验开关，默认off，取值有：
<li>off：关闭；</li>
<li>on：打开。</li> 
     * @return SessionAnalyzeSwitch 会话速率和周期特征校验开关，默认off，取值有：
<li>off：关闭；</li>
<li>on：打开。</li>
     */
    public String getSessionAnalyzeSwitch() {
        return this.SessionAnalyzeSwitch;
    }

    /**
     * Set 会话速率和周期特征校验开关，默认off，取值有：
<li>off：关闭；</li>
<li>on：打开。</li>
     * @param SessionAnalyzeSwitch 会话速率和周期特征校验开关，默认off，取值有：
<li>off：关闭；</li>
<li>on：打开。</li>
     */
    public void setSessionAnalyzeSwitch(String SessionAnalyzeSwitch) {
        this.SessionAnalyzeSwitch = SessionAnalyzeSwitch;
    }

    /**
     * Get 校验结果为未携带Cookie或Cookie已过期的统计周期。单位为秒，默认10，取值：5～3600。 
     * @return InvalidStatTime 校验结果为未携带Cookie或Cookie已过期的统计周期。单位为秒，默认10，取值：5～3600。
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set 校验结果为未携带Cookie或Cookie已过期的统计周期。单位为秒，默认10，取值：5～3600。
     * @param InvalidStatTime 校验结果为未携带Cookie或Cookie已过期的统计周期。单位为秒，默认10，取值：5～3600。
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get 校验结果为未携带Cookie或Cookie已过期的触发阈值。单位为次，默认300，取值：1～100000000。 
     * @return InvalidThreshold 校验结果为未携带Cookie或Cookie已过期的触发阈值。单位为次，默认300，取值：1～100000000。
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set 校验结果为未携带Cookie或Cookie已过期的触发阈值。单位为次，默认300，取值：1～100000000。
     * @param InvalidThreshold 校验结果为未携带Cookie或Cookie已过期的触发阈值。单位为次，默认300，取值：1～100000000。
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Cookie校验校验结果。 
     * @return AlgDetectResults Cookie校验校验结果。
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Cookie校验校验结果。
     * @param AlgDetectResults Cookie校验校验结果。
     */
    public void setAlgDetectResults(AlgDetectResult [] AlgDetectResults) {
        this.AlgDetectResults = AlgDetectResults;
    }

    /**
     * Get 会话速率和周期特征校验结果。 
     * @return SessionBehaviors 会话速率和周期特征校验结果。
     */
    public AlgDetectResult [] getSessionBehaviors() {
        return this.SessionBehaviors;
    }

    /**
     * Set 会话速率和周期特征校验结果。
     * @param SessionBehaviors 会话速率和周期特征校验结果。
     */
    public void setSessionBehaviors(AlgDetectResult [] SessionBehaviors) {
        this.SessionBehaviors = SessionBehaviors;
    }

    public AlgDetectSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectSession(AlgDetectSession source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.SessionAnalyzeSwitch != null) {
            this.SessionAnalyzeSwitch = new String(source.SessionAnalyzeSwitch);
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
        if (source.SessionBehaviors != null) {
            this.SessionBehaviors = new AlgDetectResult[source.SessionBehaviors.length];
            for (int i = 0; i < source.SessionBehaviors.length; i++) {
                this.SessionBehaviors[i] = new AlgDetectResult(source.SessionBehaviors[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "SessionAnalyzeSwitch", this.SessionAnalyzeSwitch);
        this.setParamSimple(map, prefix + "InvalidStatTime", this.InvalidStatTime);
        this.setParamSimple(map, prefix + "InvalidThreshold", this.InvalidThreshold);
        this.setParamArrayObj(map, prefix + "AlgDetectResults.", this.AlgDetectResults);
        this.setParamArrayObj(map, prefix + "SessionBehaviors.", this.SessionBehaviors);

    }
}


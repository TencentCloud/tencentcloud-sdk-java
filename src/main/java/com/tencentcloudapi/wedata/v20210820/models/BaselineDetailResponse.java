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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineDetailResponse extends AbstractModel{

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineDto")
    @Expose
    private BaselineDto BaselineDto;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineCreateAlarmRuleRequest")
    @Expose
    private CreateAlarmRuleRequest BaselineCreateAlarmRuleRequest;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewAlarm")
    @Expose
    private Boolean IsNewAlarm;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineDto 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineDto getBaselineDto() {
        return this.BaselineDto;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineDto 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineDto(BaselineDto BaselineDto) {
        this.BaselineDto = BaselineDto;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineCreateAlarmRuleRequest 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateAlarmRuleRequest getBaselineCreateAlarmRuleRequest() {
        return this.BaselineCreateAlarmRuleRequest;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineCreateAlarmRuleRequest 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineCreateAlarmRuleRequest(CreateAlarmRuleRequest BaselineCreateAlarmRuleRequest) {
        this.BaselineCreateAlarmRuleRequest = BaselineCreateAlarmRuleRequest;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewAlarm 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNewAlarm() {
        return this.IsNewAlarm;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewAlarm 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewAlarm(Boolean IsNewAlarm) {
        this.IsNewAlarm = IsNewAlarm;
    }

    public BaselineDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDetailResponse(BaselineDetailResponse source) {
        if (source.BaselineDto != null) {
            this.BaselineDto = new BaselineDto(source.BaselineDto);
        }
        if (source.BaselineCreateAlarmRuleRequest != null) {
            this.BaselineCreateAlarmRuleRequest = new CreateAlarmRuleRequest(source.BaselineCreateAlarmRuleRequest);
        }
        if (source.IsNewAlarm != null) {
            this.IsNewAlarm = new Boolean(source.IsNewAlarm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaselineDto.", this.BaselineDto);
        this.setParamObj(map, prefix + "BaselineCreateAlarmRuleRequest.", this.BaselineCreateAlarmRuleRequest);
        this.setParamSimple(map, prefix + "IsNewAlarm", this.IsNewAlarm);

    }
}


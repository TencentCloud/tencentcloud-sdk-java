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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerAction extends AbstractModel{

    /**
    * 定时预置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 定时预置并发数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerProvisionedConcurrencyNum")
    @Expose
    private Long TriggerProvisionedConcurrencyNum;

    /**
    * 设置定时触发器的时间配置，cron表达式。Cron 表达式有七个必需字段，按空格分隔。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCronConfig")
    @Expose
    private String TriggerCronConfig;

    /**
    * 预置类型 Default
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProvisionedType")
    @Expose
    private String ProvisionedType;

    /**
     * Get 定时预置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerName 定时预置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 定时预置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerName 定时预置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 定时预置并发数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerProvisionedConcurrencyNum 定时预置并发数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerProvisionedConcurrencyNum() {
        return this.TriggerProvisionedConcurrencyNum;
    }

    /**
     * Set 定时预置并发数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerProvisionedConcurrencyNum 定时预置并发数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerProvisionedConcurrencyNum(Long TriggerProvisionedConcurrencyNum) {
        this.TriggerProvisionedConcurrencyNum = TriggerProvisionedConcurrencyNum;
    }

    /**
     * Get 设置定时触发器的时间配置，cron表达式。Cron 表达式有七个必需字段，按空格分隔。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerCronConfig 设置定时触发器的时间配置，cron表达式。Cron 表达式有七个必需字段，按空格分隔。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerCronConfig() {
        return this.TriggerCronConfig;
    }

    /**
     * Set 设置定时触发器的时间配置，cron表达式。Cron 表达式有七个必需字段，按空格分隔。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerCronConfig 设置定时触发器的时间配置，cron表达式。Cron 表达式有七个必需字段，按空格分隔。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerCronConfig(String TriggerCronConfig) {
        this.TriggerCronConfig = TriggerCronConfig;
    }

    /**
     * Get 预置类型 Default
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProvisionedType 预置类型 Default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvisionedType() {
        return this.ProvisionedType;
    }

    /**
     * Set 预置类型 Default
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProvisionedType 预置类型 Default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvisionedType(String ProvisionedType) {
        this.ProvisionedType = ProvisionedType;
    }

    public TriggerAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerAction(TriggerAction source) {
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerProvisionedConcurrencyNum != null) {
            this.TriggerProvisionedConcurrencyNum = new Long(source.TriggerProvisionedConcurrencyNum);
        }
        if (source.TriggerCronConfig != null) {
            this.TriggerCronConfig = new String(source.TriggerCronConfig);
        }
        if (source.ProvisionedType != null) {
            this.ProvisionedType = new String(source.ProvisionedType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "TriggerProvisionedConcurrencyNum", this.TriggerProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "TriggerCronConfig", this.TriggerCronConfig);
        this.setParamSimple(map, prefix + "ProvisionedType", this.ProvisionedType);

    }
}


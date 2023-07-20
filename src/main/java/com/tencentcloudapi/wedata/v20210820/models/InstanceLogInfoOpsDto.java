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

public class InstanceLogInfoOpsDto extends AbstractModel{

    /**
    * 实例运行日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * 实例运行提交的yarn日志地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnLogInfo")
    @Expose
    private String [] YarnLogInfo;

    /**
    * 实例运行产生的datax日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataLogInfo")
    @Expose
    private String DataLogInfo;

    /**
    * 第三方任务运行日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdTaskRunLogInfo")
    @Expose
    private String ThirdTaskRunLogInfo;

    /**
    * 第三方任务日志链接描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdTaskLogUrlDesc")
    @Expose
    private String ThirdTaskLogUrlDesc;

    /**
     * Get 实例运行日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogInfo 实例运行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set 实例运行日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogInfo 实例运行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get 实例运行提交的yarn日志地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnLogInfo 实例运行提交的yarn日志地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getYarnLogInfo() {
        return this.YarnLogInfo;
    }

    /**
     * Set 实例运行提交的yarn日志地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnLogInfo 实例运行提交的yarn日志地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnLogInfo(String [] YarnLogInfo) {
        this.YarnLogInfo = YarnLogInfo;
    }

    /**
     * Get 实例运行产生的datax日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataLogInfo 实例运行产生的datax日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataLogInfo() {
        return this.DataLogInfo;
    }

    /**
     * Set 实例运行产生的datax日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataLogInfo 实例运行产生的datax日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataLogInfo(String DataLogInfo) {
        this.DataLogInfo = DataLogInfo;
    }

    /**
     * Get 第三方任务运行日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdTaskRunLogInfo 第三方任务运行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdTaskRunLogInfo() {
        return this.ThirdTaskRunLogInfo;
    }

    /**
     * Set 第三方任务运行日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdTaskRunLogInfo 第三方任务运行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdTaskRunLogInfo(String ThirdTaskRunLogInfo) {
        this.ThirdTaskRunLogInfo = ThirdTaskRunLogInfo;
    }

    /**
     * Get 第三方任务日志链接描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdTaskLogUrlDesc 第三方任务日志链接描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdTaskLogUrlDesc() {
        return this.ThirdTaskLogUrlDesc;
    }

    /**
     * Set 第三方任务日志链接描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdTaskLogUrlDesc 第三方任务日志链接描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdTaskLogUrlDesc(String ThirdTaskLogUrlDesc) {
        this.ThirdTaskLogUrlDesc = ThirdTaskLogUrlDesc;
    }

    public InstanceLogInfoOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogInfoOpsDto(InstanceLogInfoOpsDto source) {
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.YarnLogInfo != null) {
            this.YarnLogInfo = new String[source.YarnLogInfo.length];
            for (int i = 0; i < source.YarnLogInfo.length; i++) {
                this.YarnLogInfo[i] = new String(source.YarnLogInfo[i]);
            }
        }
        if (source.DataLogInfo != null) {
            this.DataLogInfo = new String(source.DataLogInfo);
        }
        if (source.ThirdTaskRunLogInfo != null) {
            this.ThirdTaskRunLogInfo = new String(source.ThirdTaskRunLogInfo);
        }
        if (source.ThirdTaskLogUrlDesc != null) {
            this.ThirdTaskLogUrlDesc = new String(source.ThirdTaskLogUrlDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamArraySimple(map, prefix + "YarnLogInfo.", this.YarnLogInfo);
        this.setParamSimple(map, prefix + "DataLogInfo", this.DataLogInfo);
        this.setParamSimple(map, prefix + "ThirdTaskRunLogInfo", this.ThirdTaskRunLogInfo);
        this.setParamSimple(map, prefix + "ThirdTaskLogUrlDesc", this.ThirdTaskLogUrlDesc);

    }
}


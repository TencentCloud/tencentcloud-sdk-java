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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDetailInfo extends AbstractModel{

    /**
    * 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 主从差距，MB；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * 主从差距，秒；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfo")
    @Expose
    private StepDetailInfo [] StepInfo;

    /**
     * Get 总步骤数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepAll 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepAll 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNow 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNow 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 主从差距，MB；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterSlaveDistance 主从差距，MB；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set 主从差距，MB；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterSlaveDistance 主从差距，MB；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get 主从差距，秒；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsBehindMaster 主从差距，秒；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set 主从差距，秒；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsBehindMaster 主从差距，秒；只在任务正常，迁移或者同步的最后一步（追Binlog的阶段才有校），如果是非法值，返回-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get 步骤信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfo 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepDetailInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfo 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfo(StepDetailInfo [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    public MigrateDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDetailInfo(MigrateDetailInfo source) {
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.MasterSlaveDistance != null) {
            this.MasterSlaveDistance = new Long(source.MasterSlaveDistance);
        }
        if (source.SecondsBehindMaster != null) {
            this.SecondsBehindMaster = new Long(source.SecondsBehindMaster);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new StepDetailInfo[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new StepDetailInfo(source.StepInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "MasterSlaveDistance", this.MasterSlaveDistance);
        this.setParamSimple(map, prefix + "SecondsBehindMaster", this.SecondsBehindMaster);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);

    }
}


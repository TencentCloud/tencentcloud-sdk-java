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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowAdvanceConfig extends AbstractModel {

    /**
    * 排队模式，ON（默认）, OFF
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueuingMode")
    @Expose
    private String QueuingMode;

    /**
    * 	
默认值为1

QueuingMode为ON时，MaxConcurrentNum 设置才生效；只能输入大于0的整数，输入非法值自动转换为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrentNum")
    @Expose
    private Long MaxConcurrentNum;

    /**
     * Get 排队模式，ON（默认）, OFF
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueuingMode 排队模式，ON（默认）, OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueuingMode() {
        return this.QueuingMode;
    }

    /**
     * Set 排队模式，ON（默认）, OFF
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueuingMode 排队模式，ON（默认）, OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueuingMode(String QueuingMode) {
        this.QueuingMode = QueuingMode;
    }

    /**
     * Get 	
默认值为1

QueuingMode为ON时，MaxConcurrentNum 设置才生效；只能输入大于0的整数，输入非法值自动转换为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrentNum 	
默认值为1

QueuingMode为ON时，MaxConcurrentNum 设置才生效；只能输入大于0的整数，输入非法值自动转换为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrentNum() {
        return this.MaxConcurrentNum;
    }

    /**
     * Set 	
默认值为1

QueuingMode为ON时，MaxConcurrentNum 设置才生效；只能输入大于0的整数，输入非法值自动转换为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrentNum 	
默认值为1

QueuingMode为ON时，MaxConcurrentNum 设置才生效；只能输入大于0的整数，输入非法值自动转换为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrentNum(Long MaxConcurrentNum) {
        this.MaxConcurrentNum = MaxConcurrentNum;
    }

    public WorkflowAdvanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowAdvanceConfig(WorkflowAdvanceConfig source) {
        if (source.QueuingMode != null) {
            this.QueuingMode = new String(source.QueuingMode);
        }
        if (source.MaxConcurrentNum != null) {
            this.MaxConcurrentNum = new Long(source.MaxConcurrentNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueuingMode", this.QueuingMode);
        this.setParamSimple(map, prefix + "MaxConcurrentNum", this.MaxConcurrentNum);

    }
}


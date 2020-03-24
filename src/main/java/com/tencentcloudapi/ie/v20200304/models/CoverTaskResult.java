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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverTaskResult extends AbstractModel{

    /**
    * 编辑任务状态。 
1：执行中；2：成功；3：失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 编辑任务失败错误码。 
0：成功；其他值：失败。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 编辑任务失败错误描述。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 智能封面结果集。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemSet")
    @Expose
    private CoverTaskResultItem [] ItemSet;

    /**
     * Get 编辑任务状态。 
1：执行中；2：成功；3：失败。 
     * @return Status 编辑任务状态。 
1：执行中；2：成功；3：失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 编辑任务状态。 
1：执行中；2：成功；3：失败。
     * @param Status 编辑任务状态。 
1：执行中；2：成功；3：失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 编辑任务失败错误码。 
0：成功；其他值：失败。 
     * @return ErrCode 编辑任务失败错误码。 
0：成功；其他值：失败。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 编辑任务失败错误码。 
0：成功；其他值：失败。
     * @param ErrCode 编辑任务失败错误码。 
0：成功；其他值：失败。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 编辑任务失败错误描述。 
     * @return ErrMsg 编辑任务失败错误描述。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 编辑任务失败错误描述。
     * @param ErrMsg 编辑任务失败错误描述。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 智能封面结果集。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemSet 智能封面结果集。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CoverTaskResultItem [] getItemSet() {
        return this.ItemSet;
    }

    /**
     * Set 智能封面结果集。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemSet 智能封面结果集。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemSet(CoverTaskResultItem [] ItemSet) {
        this.ItemSet = ItemSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamArrayObj(map, prefix + "ItemSet.", this.ItemSet);

    }
}


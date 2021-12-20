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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyEnterpriseFourFactorsResponse extends AbstractModel{

    /**
    * 核验一致性（1:一致，2:不一致，3:查询无记录）
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 核验结果明细，7：企业法人/负责人，6：企业股东，5：企
业管理人员，-21：企业名称与企业标识不符，-22：姓名不一致，-23：证件号码不一致，-24：企业名称不一致，-25：企业标识不一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private Detail Detail;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核验一致性（1:一致，2:不一致，3:查询无记录） 
     * @return State 核验一致性（1:一致，2:不一致，3:查询无记录）
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 核验一致性（1:一致，2:不一致，3:查询无记录）
     * @param State 核验一致性（1:一致，2:不一致，3:查询无记录）
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 核验结果明细，7：企业法人/负责人，6：企业股东，5：企
业管理人员，-21：企业名称与企业标识不符，-22：姓名不一致，-23：证件号码不一致，-24：企业名称不一致，-25：企业标识不一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 核验结果明细，7：企业法人/负责人，6：企业股东，5：企
业管理人员，-21：企业名称与企业标识不符，-22：姓名不一致，-23：证件号码不一致，-24：企业名称不一致，-25：企业标识不一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Detail getDetail() {
        return this.Detail;
    }

    /**
     * Set 核验结果明细，7：企业法人/负责人，6：企业股东，5：企
业管理人员，-21：企业名称与企业标识不符，-22：姓名不一致，-23：证件号码不一致，-24：企业名称不一致，-25：企业标识不一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 核验结果明细，7：企业法人/负责人，6：企业股东，5：企
业管理人员，-21：企业名称与企业标识不符，-22：姓名不一致，-23：证件号码不一致，-24：企业名称不一致，-25：企业标识不一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(Detail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyEnterpriseFourFactorsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyEnterpriseFourFactorsResponse(VerifyEnterpriseFourFactorsResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Detail != null) {
            this.Detail = new Detail(source.Detail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


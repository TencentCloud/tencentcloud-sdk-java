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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMemberInfo extends AbstractModel{

    /**
    * 团队成员 ID。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 团队成员备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 团队成员 ID。 
     * @return MemberId 团队成员 ID。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 团队成员 ID。
     * @param MemberId 团队成员 ID。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 团队成员备注。 
     * @return Remark 团队成员备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 团队成员备注。
     * @param Remark 团队成员备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}


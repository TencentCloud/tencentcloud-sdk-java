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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateTargetGroupsRequest extends AbstractModel {

    /**
    * 待解绑的目标组列表。
    */
    @SerializedName("Associations")
    @Expose
    private TargetGroupAssociation [] Associations;

    /**
     * Get 待解绑的目标组列表。 
     * @return Associations 待解绑的目标组列表。
     */
    public TargetGroupAssociation [] getAssociations() {
        return this.Associations;
    }

    /**
     * Set 待解绑的目标组列表。
     * @param Associations 待解绑的目标组列表。
     */
    public void setAssociations(TargetGroupAssociation [] Associations) {
        this.Associations = Associations;
    }

    public DisassociateTargetGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateTargetGroupsRequest(DisassociateTargetGroupsRequest source) {
        if (source.Associations != null) {
            this.Associations = new TargetGroupAssociation[source.Associations.length];
            for (int i = 0; i < source.Associations.length; i++) {
                this.Associations[i] = new TargetGroupAssociation(source.Associations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Associations.", this.Associations);

    }
}


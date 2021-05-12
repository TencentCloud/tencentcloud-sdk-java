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

public class ResourceInfo extends AbstractModel{

    /**
    * 媒资和分类资源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 资源归属，个人或团队。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
     * Get 媒资和分类资源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 媒资和分类资源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 媒资和分类资源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 媒资和分类资源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 资源归属，个人或团队。 
     * @return Owner 资源归属，个人或团队。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 资源归属，个人或团队。
     * @param Owner 资源归属，个人或团队。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamObj(map, prefix + "Owner.", this.Owner);

    }
}


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

public class DescribeSharedSpaceRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 被授权目标，个人或团队。
    */
    @SerializedName("Authorizee")
    @Expose
    private Entity Authorizee;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以查询任意个人或者团队的共享空间。如果指定操作者，则操作者必须本人或者团队成员。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 被授权目标，个人或团队。 
     * @return Authorizee 被授权目标，个人或团队。
     */
    public Entity getAuthorizee() {
        return this.Authorizee;
    }

    /**
     * Set 被授权目标，个人或团队。
     * @param Authorizee 被授权目标，个人或团队。
     */
    public void setAuthorizee(Entity Authorizee) {
        this.Authorizee = Authorizee;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以查询任意个人或者团队的共享空间。如果指定操作者，则操作者必须本人或者团队成员。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以查询任意个人或者团队的共享空间。如果指定操作者，则操作者必须本人或者团队成员。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以查询任意个人或者团队的共享空间。如果指定操作者，则操作者必须本人或者团队成员。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以查询任意个人或者团队的共享空间。如果指定操作者，则操作者必须本人或者团队成员。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeSharedSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSharedSpaceRequest(DescribeSharedSpaceRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Authorizee != null) {
            this.Authorizee = new Entity(source.Authorizee);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamObj(map, prefix + "Authorizee.", this.Authorizee);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}


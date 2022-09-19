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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Auth extends AbstractModel{

    /**
    * 当前账号具有的权限信息。<ul><li>0：无权限。</li><li>1：只读。</li><li>2：只写。</li><li>3：读写。</li></ul>
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * 指具有当前账号权限的数据库名。
<ul><li>* ：表示所有数据库。</li><li>db.name：表示特定name的数据库。</li></ul>
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
     * Get 当前账号具有的权限信息。<ul><li>0：无权限。</li><li>1：只读。</li><li>2：只写。</li><li>3：读写。</li></ul> 
     * @return Mask 当前账号具有的权限信息。<ul><li>0：无权限。</li><li>1：只读。</li><li>2：只写。</li><li>3：读写。</li></ul>
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set 当前账号具有的权限信息。<ul><li>0：无权限。</li><li>1：只读。</li><li>2：只写。</li><li>3：读写。</li></ul>
     * @param Mask 当前账号具有的权限信息。<ul><li>0：无权限。</li><li>1：只读。</li><li>2：只写。</li><li>3：读写。</li></ul>
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 指具有当前账号权限的数据库名。
<ul><li>* ：表示所有数据库。</li><li>db.name：表示特定name的数据库。</li></ul> 
     * @return NameSpace 指具有当前账号权限的数据库名。
<ul><li>* ：表示所有数据库。</li><li>db.name：表示特定name的数据库。</li></ul>
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 指具有当前账号权限的数据库名。
<ul><li>* ：表示所有数据库。</li><li>db.name：表示特定name的数据库。</li></ul>
     * @param NameSpace 指具有当前账号权限的数据库名。
<ul><li>* ：表示所有数据库。</li><li>db.name：表示特定name的数据库。</li></ul>
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    public Auth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Auth(Auth source) {
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);

    }
}


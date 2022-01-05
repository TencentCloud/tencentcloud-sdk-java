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
    * *表示所有数据库,db.name表示特定的name数据库。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 用于控制权限,0无权限，1只读，2只写，3读写。
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
     * Get *表示所有数据库,db.name表示特定的name数据库。 
     * @return NameSpace *表示所有数据库,db.name表示特定的name数据库。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set *表示所有数据库,db.name表示特定的name数据库。
     * @param NameSpace *表示所有数据库,db.name表示特定的name数据库。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 用于控制权限,0无权限，1只读，2只写，3读写。 
     * @return Mask 用于控制权限,0无权限，1只读，2只写，3读写。
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set 用于控制权限,0无权限，1只读，2只写，3读写。
     * @param Mask 用于控制权限,0无权限，1只读，2只写，3读写。
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    public Auth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Auth(Auth source) {
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}


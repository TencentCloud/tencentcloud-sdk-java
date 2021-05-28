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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VsmInfo extends AbstractModel{

    /**
    * VSM类型名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * VSM类型值
    */
    @SerializedName("TypeID")
    @Expose
    private Long TypeID;

    /**
     * Get VSM类型名称 
     * @return TypeName VSM类型名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set VSM类型名称
     * @param TypeName VSM类型名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get VSM类型值 
     * @return TypeID VSM类型值
     */
    public Long getTypeID() {
        return this.TypeID;
    }

    /**
     * Set VSM类型值
     * @param TypeID VSM类型值
     */
    public void setTypeID(Long TypeID) {
        this.TypeID = TypeID;
    }

    public VsmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VsmInfo(VsmInfo source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.TypeID != null) {
            this.TypeID = new Long(source.TypeID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);

    }
}


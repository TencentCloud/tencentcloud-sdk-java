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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * 数据库标识
    */
    @SerializedName("Fid")
    @Expose
    private Long Fid;

    /**
    * 标签名称
    */
    @SerializedName("Fname")
    @Expose
    private String Fname;

    /**
     * Get 数据库标识 
     * @return Fid 数据库标识
     */
    public Long getFid() {
        return this.Fid;
    }

    /**
     * Set 数据库标识
     * @param Fid 数据库标识
     */
    public void setFid(Long Fid) {
        this.Fid = Fid;
    }

    /**
     * Get 标签名称 
     * @return Fname 标签名称
     */
    public String getFname() {
        return this.Fname;
    }

    /**
     * Set 标签名称
     * @param Fname 标签名称
     */
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Fid != null) {
            this.Fid = new Long(source.Fid);
        }
        if (source.Fname != null) {
            this.Fname = new String(source.Fname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fid", this.Fid);
        this.setParamSimple(map, prefix + "Fname", this.Fname);

    }
}


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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVSingerBaseInfo extends AbstractModel{

    /**
    * 歌手id
    */
    @SerializedName("SingerId")
    @Expose
    private String SingerId;

    /**
    * 歌手名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 歌手id 
     * @return SingerId 歌手id
     */
    public String getSingerId() {
        return this.SingerId;
    }

    /**
     * Set 歌手id
     * @param SingerId 歌手id
     */
    public void setSingerId(String SingerId) {
        this.SingerId = SingerId;
    }

    /**
     * Get 歌手名 
     * @return Name 歌手名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌手名
     * @param Name 歌手名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public KTVSingerBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVSingerBaseInfo(KTVSingerBaseInfo source) {
        if (source.SingerId != null) {
            this.SingerId = new String(source.SingerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SingerId", this.SingerId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}


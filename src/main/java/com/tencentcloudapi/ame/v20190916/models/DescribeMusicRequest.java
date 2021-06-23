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

public class DescribeMusicRequest extends AbstractModel{

    /**
    * 歌曲ID
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 在应用前端播放音乐C端用户的唯一标识。无需是账户信息，用户唯一标识即可。
    */
    @SerializedName("IdentityId")
    @Expose
    private String IdentityId;

    /**
    * MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
    */
    @SerializedName("SubItemType")
    @Expose
    private String SubItemType;

    /**
    * CDN URL Protocol:HTTP or HTTPS/SSL
Values:Y , N(default)
    */
    @SerializedName("Ssl")
    @Expose
    private String Ssl;

    /**
     * Get 歌曲ID 
     * @return ItemId 歌曲ID
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 歌曲ID
     * @param ItemId 歌曲ID
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 在应用前端播放音乐C端用户的唯一标识。无需是账户信息，用户唯一标识即可。 
     * @return IdentityId 在应用前端播放音乐C端用户的唯一标识。无需是账户信息，用户唯一标识即可。
     */
    public String getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 在应用前端播放音乐C端用户的唯一标识。无需是账户信息，用户唯一标识即可。
     * @param IdentityId 在应用前端播放音乐C端用户的唯一标识。无需是账户信息，用户唯一标识即可。
     */
    public void setIdentityId(String IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。 
     * @return SubItemType MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     */
    public String getSubItemType() {
        return this.SubItemType;
    }

    /**
     * Set MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     * @param SubItemType MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     */
    public void setSubItemType(String SubItemType) {
        this.SubItemType = SubItemType;
    }

    /**
     * Get CDN URL Protocol:HTTP or HTTPS/SSL
Values:Y , N(default) 
     * @return Ssl CDN URL Protocol:HTTP or HTTPS/SSL
Values:Y , N(default)
     */
    public String getSsl() {
        return this.Ssl;
    }

    /**
     * Set CDN URL Protocol:HTTP or HTTPS/SSL
Values:Y , N(default)
     * @param Ssl CDN URL Protocol:HTTP or HTTPS/SSL
Values:Y , N(default)
     */
    public void setSsl(String Ssl) {
        this.Ssl = Ssl;
    }

    public DescribeMusicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMusicRequest(DescribeMusicRequest source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new String(source.IdentityId);
        }
        if (source.SubItemType != null) {
            this.SubItemType = new String(source.SubItemType);
        }
        if (source.Ssl != null) {
            this.Ssl = new String(source.Ssl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "SubItemType", this.SubItemType);
        this.setParamSimple(map, prefix + "Ssl", this.Ssl);

    }
}


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

public class SetPlaylistCommandInput extends AbstractModel{

    /**
    * 变更类型，取值有：
<li>Add：添加</li>
<li>Delete：删除</li>
<li>ClearList：清空歌曲列表</li>
<li>Move：移动歌曲</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 歌单索引位置，
当 Type 取 Add 时，-1表示添加在列表最后位置，大于-1表示要添加的位置；
当 Type 取 Delete 时，表示待删除歌曲的位置；
当 Type 取 Move 时，表示待调整歌曲的位置。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 当 Type 取 Move 时，必填，表示移动歌曲的目标位置。
    */
    @SerializedName("ChangedIndex")
    @Expose
    private Long ChangedIndex;

    /**
    * 歌曲 ID 列表，当 Type 取 Add 时，与MusicURLs必填其中一项。
    */
    @SerializedName("MusicIds")
    @Expose
    private String [] MusicIds;

    /**
    * 歌曲 URL 列表，当 Type 取 Add 时，与MusicIds必填其中一项。
注：URL必须以.mp3结尾且必须是mp3编码文件。
    */
    @SerializedName("MusicURLs")
    @Expose
    private String [] MusicURLs;

    /**
     * Get 变更类型，取值有：
<li>Add：添加</li>
<li>Delete：删除</li>
<li>ClearList：清空歌曲列表</li>
<li>Move：移动歌曲</li> 
     * @return Type 变更类型，取值有：
<li>Add：添加</li>
<li>Delete：删除</li>
<li>ClearList：清空歌曲列表</li>
<li>Move：移动歌曲</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 变更类型，取值有：
<li>Add：添加</li>
<li>Delete：删除</li>
<li>ClearList：清空歌曲列表</li>
<li>Move：移动歌曲</li>
     * @param Type 变更类型，取值有：
<li>Add：添加</li>
<li>Delete：删除</li>
<li>ClearList：清空歌曲列表</li>
<li>Move：移动歌曲</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 歌单索引位置，
当 Type 取 Add 时，-1表示添加在列表最后位置，大于-1表示要添加的位置；
当 Type 取 Delete 时，表示待删除歌曲的位置；
当 Type 取 Move 时，表示待调整歌曲的位置。 
     * @return Index 歌单索引位置，
当 Type 取 Add 时，-1表示添加在列表最后位置，大于-1表示要添加的位置；
当 Type 取 Delete 时，表示待删除歌曲的位置；
当 Type 取 Move 时，表示待调整歌曲的位置。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 歌单索引位置，
当 Type 取 Add 时，-1表示添加在列表最后位置，大于-1表示要添加的位置；
当 Type 取 Delete 时，表示待删除歌曲的位置；
当 Type 取 Move 时，表示待调整歌曲的位置。
     * @param Index 歌单索引位置，
当 Type 取 Add 时，-1表示添加在列表最后位置，大于-1表示要添加的位置；
当 Type 取 Delete 时，表示待删除歌曲的位置；
当 Type 取 Move 时，表示待调整歌曲的位置。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 当 Type 取 Move 时，必填，表示移动歌曲的目标位置。 
     * @return ChangedIndex 当 Type 取 Move 时，必填，表示移动歌曲的目标位置。
     */
    public Long getChangedIndex() {
        return this.ChangedIndex;
    }

    /**
     * Set 当 Type 取 Move 时，必填，表示移动歌曲的目标位置。
     * @param ChangedIndex 当 Type 取 Move 时，必填，表示移动歌曲的目标位置。
     */
    public void setChangedIndex(Long ChangedIndex) {
        this.ChangedIndex = ChangedIndex;
    }

    /**
     * Get 歌曲 ID 列表，当 Type 取 Add 时，与MusicURLs必填其中一项。 
     * @return MusicIds 歌曲 ID 列表，当 Type 取 Add 时，与MusicURLs必填其中一项。
     */
    public String [] getMusicIds() {
        return this.MusicIds;
    }

    /**
     * Set 歌曲 ID 列表，当 Type 取 Add 时，与MusicURLs必填其中一项。
     * @param MusicIds 歌曲 ID 列表，当 Type 取 Add 时，与MusicURLs必填其中一项。
     */
    public void setMusicIds(String [] MusicIds) {
        this.MusicIds = MusicIds;
    }

    /**
     * Get 歌曲 URL 列表，当 Type 取 Add 时，与MusicIds必填其中一项。
注：URL必须以.mp3结尾且必须是mp3编码文件。 
     * @return MusicURLs 歌曲 URL 列表，当 Type 取 Add 时，与MusicIds必填其中一项。
注：URL必须以.mp3结尾且必须是mp3编码文件。
     */
    public String [] getMusicURLs() {
        return this.MusicURLs;
    }

    /**
     * Set 歌曲 URL 列表，当 Type 取 Add 时，与MusicIds必填其中一项。
注：URL必须以.mp3结尾且必须是mp3编码文件。
     * @param MusicURLs 歌曲 URL 列表，当 Type 取 Add 时，与MusicIds必填其中一项。
注：URL必须以.mp3结尾且必须是mp3编码文件。
     */
    public void setMusicURLs(String [] MusicURLs) {
        this.MusicURLs = MusicURLs;
    }

    public SetPlaylistCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetPlaylistCommandInput(SetPlaylistCommandInput source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.ChangedIndex != null) {
            this.ChangedIndex = new Long(source.ChangedIndex);
        }
        if (source.MusicIds != null) {
            this.MusicIds = new String[source.MusicIds.length];
            for (int i = 0; i < source.MusicIds.length; i++) {
                this.MusicIds[i] = new String(source.MusicIds[i]);
            }
        }
        if (source.MusicURLs != null) {
            this.MusicURLs = new String[source.MusicURLs.length];
            for (int i = 0; i < source.MusicURLs.length; i++) {
                this.MusicURLs[i] = new String(source.MusicURLs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "ChangedIndex", this.ChangedIndex);
        this.setParamArraySimple(map, prefix + "MusicIds.", this.MusicIds);
        this.setParamArraySimple(map, prefix + "MusicURLs.", this.MusicURLs);

    }
}


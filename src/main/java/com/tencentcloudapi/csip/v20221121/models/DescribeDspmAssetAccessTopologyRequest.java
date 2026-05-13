/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmAssetAccessTopologyRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 视图类型。ip或instance
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * - 来源ip方式查看
View: "ip"

Filter:{
	{
		"Name":"Ip",
		"Values":["172.1.1.1"]
	},
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou","cdb-2222|ap-guangzhou","cdb-3333|ap-guangzhou"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}


- 实例方式查看
View: "instance"

Filter:{
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou"]
	},
	{
		"Name":"Ip",
		"Values":["172.1.1.1","172.1.1.2","172.1.1.3"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}

    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 视图类型。ip或instance 
     * @return View 视图类型。ip或instance
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set 视图类型。ip或instance
     * @param View 视图类型。ip或instance
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get - 来源ip方式查看
View: "ip"

Filter:{
	{
		"Name":"Ip",
		"Values":["172.1.1.1"]
	},
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou","cdb-2222|ap-guangzhou","cdb-3333|ap-guangzhou"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}


- 实例方式查看
View: "instance"

Filter:{
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou"]
	},
	{
		"Name":"Ip",
		"Values":["172.1.1.1","172.1.1.2","172.1.1.3"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}
 
     * @return Filter - 来源ip方式查看
View: "ip"

Filter:{
	{
		"Name":"Ip",
		"Values":["172.1.1.1"]
	},
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou","cdb-2222|ap-guangzhou","cdb-3333|ap-guangzhou"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}


- 实例方式查看
View: "instance"

Filter:{
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou"]
	},
	{
		"Name":"Ip",
		"Values":["172.1.1.1","172.1.1.2","172.1.1.3"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}

     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set - 来源ip方式查看
View: "ip"

Filter:{
	{
		"Name":"Ip",
		"Values":["172.1.1.1"]
	},
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou","cdb-2222|ap-guangzhou","cdb-3333|ap-guangzhou"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}


- 实例方式查看
View: "instance"

Filter:{
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou"]
	},
	{
		"Name":"Ip",
		"Values":["172.1.1.1","172.1.1.2","172.1.1.3"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}

     * @param Filter - 来源ip方式查看
View: "ip"

Filter:{
	{
		"Name":"Ip",
		"Values":["172.1.1.1"]
	},
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou","cdb-2222|ap-guangzhou","cdb-3333|ap-guangzhou"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}


- 实例方式查看
View: "instance"

Filter:{
	{
		"Name":"AssetId",
		"Values":["cdb-1111|ap-guangzhou"]
	},
	{
		"Name":"Ip",
		"Values":["172.1.1.1","172.1.1.2","172.1.1.3"]
	},
	{
		"Name":"Account",
		"Values":["root|%","test|%"]
	}
}

     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeDspmAssetAccessTopologyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetAccessTopologyRequest(DescribeDspmAssetAccessTopologyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}


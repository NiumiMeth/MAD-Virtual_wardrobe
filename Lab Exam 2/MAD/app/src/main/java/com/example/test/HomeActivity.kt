class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Handle Home Navigation
                    true
                }
                R.id.nav_category -> {
                    // Handle Category Navigation
                    true
                }
                R.id.nav_cart -> {
                    // Handle Cart Navigation
                    true
                }
                R.id.nav_profile -> {
                    // Handle Profile Navigation
                    true
                }
                else -> false
            }
        }

        // Example of a button click for "Shop Now"
        val shopNowButton: Button = findViewById(R.id.shop_now_button)
        shopNowButton.setOnClickListener {
            // Start Shop Activity or whatever action
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }
    }
}

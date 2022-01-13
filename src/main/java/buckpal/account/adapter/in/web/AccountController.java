package buckpal.account.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class AccountController {

	@GetMapping("/accounts")
	List<AccountResource> listAccounts(){
		// TODO: 2022/01/13
	}

	@GetMapping("/accounts/{accountId}")
	AccountResource getAccount(@PathVariable("accountId") Long accountId) {
		// TODO: 2022/01/13
	}

	@GetMapping("/accounts/{accountId}/balance")
	AccountResource geAccountBalance(@PathVariable("accountId") Long accountId) {
		// TODO: 2022/01/13
	}
	@PostMapping("/accounts")
	AccountResource createAccount(@RequestBody AccountResource account) {
		// TODO: 2022/01/13
	}

	@PostMapping("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
	AccountResource createAccount(
			@PathVariable("sourceAccountId") Long sourceAccountId,
			@PathVariable("targetAccountId") Long targetAccountId,
			@PathVariable("amount") Long amount
	) {
		// TODO: 2022/01/13
	}
}
